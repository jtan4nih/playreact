var BloggerMessageDetail = React.createClass({
  loadBloggerMessages: function() {
    $.ajax({
      url: this.props.url,
      dataType: 'json',
      cache: false,
      success: function(data) {
        this.setState({data: data});
      }.bind(this),
      error: function(xhr, status, err) {
        console.error(this.props.url, status, err.toString());
      }.bind(this)
    });
  },
  getInitialState: function() {
    return {data: []};
  },
  componentDidMount: function() {
    this.loadBloggerMessages();
    setInterval(this.loadBloggerMessages, this.props.pollInterval);
  },
  render: function() {
    return (
      <div className="">
        <h1>Blogging Messages</h1>
        <BloggerMessageForm />
        <BloggerMessages data={this.state.data} />
      </div>
    );
  }
});

var BloggerMessages = React.createClass({
  render: function() {
    var bloggermessageNodes = this.props.data.map(function (bloggermessage) {
      return (
        <BloggerMessage key={bloggermessage.id} title={bloggermessage.title} text={bloggermessage.text} datetime={bloggermessage.datetime} />
      );
    });

    return (
      <div className="well">
        {bloggermessageNodes}
      </div>
    );
  }
});

var BloggerMessage = React.createClass({
  render: function() {
    return (
      <blockquote>
        <p>{this.props.title}</p>
        <strong>{this.props.text}</strong>
        <small>{this.props.datetime}</small>
      </blockquote>
    );
  }
});

var BloggerMessageForm = React.createClass({
  handleSubmit: function(e) {
    e.preventDefault();
        
    var formData = $("#bloggermessageForm").serialize();

    var saveUrl = "http://localhost:9000/bloggermessages/save";
    $.ajax({
      url: saveUrl,
      method: 'POST',
      dataType: 'json',
      data: formData,
      cache: false,
      success: function(data) {
        console.log(data)
      }.bind(this),
      error: function(xhr, status, err) {
        console.error(saveUrl, status, err.toString());
      }.bind(this)
    });

    // clears the form fields
    React.findDOMNode(this.refs.title).value = '';
    React.findDOMNode(this.refs.text).value = '';
    React.findDOMNode(this.refs.datetime).value = '';
    return;
  },
  render: function() {
    return (
    	<div className="row">
      		<form id="bloggermessageForm" onSubmit={this.handleSubmit}>
		        <div className="col-xs-3">
		          <div className="form-group">
		            <input type="text" name="title" required="required" ref="title" placeholder="Title" className="form-control" />
		          </div>
		        </div>
		        <div className="col-xs-3">
		          <div className="form-group">
		            <input type="text" name="text"required="required"  ref="text" placeholder="Text" className="form-control" />
		          </div>
		        </div>
		        <div className="col-xs-3">
		          <div className="form-group">
		            <input type="text" name="datetime" required="required" ref="datetime" placeholder="Date and Time
" className="form-control" />
		            <span className="input-icon fui-check-inverted"></span>
		          </div>
		        </div>
		        <div className="col-xs-3">
		          <input type="submit" className="btn btn-block btn-info" value="Add" />
		        </div>
			</form>
	   </div>
    );
  }
});

React.render(<BloggerMessageDetail url="http://localhost:9000/bloggermessages" pollInterval={2000} />, document.getElementById('content'));
