$(function(){
    var webSocket = new WebSocket('ws://localhost:8080/SSM/websocketTest');

    webSocket.onerror = function(event) {
        onError(event)
    };

    webSocket.onopen = function(event) {
        onOpen(event)
    };

    webSocket.onmessage = function(event) {
        onMessage(event)
    };

    webSocket.onclose = function(event){
        onclose(event);
    };

    $("#start").click(function(){
        webSocket.send("hello");
    });

    $("#stop").click(function(){
        webSocket.close();
    });
});

function onclose(event){
    $("#message").val("connection closed !");
}

function onMessage(event) {
    $("#message").val(event.data);
}

function onOpen(event) {
    $("#message").val("Hello ，connection ready !");
}

function onError(event) {
    alert(event.data);
}