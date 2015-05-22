$(function () {
    $('#jstree')
        .jstree({
            "plugins": [ "sort", "json_data" ],
            'core': {
                'data': {
                    'url': function (node) {
                        return node.id === '#' ? 'ajax?id=root' : 'ajax?id=' + node.id;
                    },
                    'data': function (node) {
                        return { 'id': node.id };
                    }
                }
            }
        });
});