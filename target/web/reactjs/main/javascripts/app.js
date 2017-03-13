var BloggerMessageDetail = React.createClass({displayName: "BloggerMessageDetail",
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
      React.createElement("div", {className: ""}, 
        React.createElement("h1", null, "Blogging Messages"), 
        React.createElement(BloggerMessageForm, null), 
        React.createElement(BloggerMessages, {data: this.state.data})
      )
    );
  }
});

var BloggerMessages = React.createClass({displayName: "BloggerMessages",
  render: function() {
    var bloggermessageNodes = this.props.data.map(function (bloggermessage) {
      return (
        React.createElement(BloggerMessage, {key: bloggermessage.id, title: bloggermessage.title, text: bloggermessage.text, datetime: bloggermessage.datetime})
      );
    });

    return (
      React.createElement("div", {className: "well"}, 
        bloggermessageNodes
      )
    );
  }
});

var BloggerMessage = React.createClass({displayName: "BloggerMessage",
  render: function() {
    return (
      React.createElement("blockquote", null, 
        React.createElement("p", null, this.props.title), 
        React.createElement("strong", null, this.props.text), 
        React.createElement("small", null, this.props.datetime)
      )
    );
  }
});

var BloggerMessageForm = React.createClass({displayName: "BloggerMessageForm",
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
    	React.createElement("div", {className: "row"}, 
      		React.createElement("form", {id: "bloggermessageForm", onSubmit: this.handleSubmit}, 
		        React.createElement("div", {className: "col-xs-3"}, 
		          React.createElement("div", {className: "form-group"}, 
		            React.createElement("input", {type: "text", name: "title", required: "required", ref: "title", placeholder: "Title", className: "form-control"})
		          )
		        ), 
		        React.createElement("div", {className: "col-xs-3"}, 
		          React.createElement("div", {className: "form-group"}, 
		            React.createElement("input", {type: "text", name: "text", required: "required", ref: "text", placeholder: "Text", className: "form-control"})
		          )
		        ), 
		        React.createElement("div", {className: "col-xs-3"}, 
		          React.createElement("div", {className: "form-group"}, 
		            React.createElement("input", {type: "text", name: "datetime", required: "required", ref: "datetime", placeholder: "Date and Time", 
className: "form-control"}), 
		            React.createElement("span", {className: "input-icon fui-check-inverted"})
		          )
		        ), 
		        React.createElement("div", {className: "col-xs-3"}, 
		          React.createElement("input", {type: "submit", className: "btn btn-block btn-info", value: "Add"})
		        )
			)
	   )
    );
  }
});

React.render(React.createElement(BloggerMessageDetail, {url: "http://localhost:9000/bloggermessages", pollInterval: 2000}), document.getElementById('content'));
