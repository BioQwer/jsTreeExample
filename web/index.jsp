<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index JsTree Example page</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="themes/default/style.min.css" />
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <!-- Custom styles for this template -->
    <link href="css/starter-template.css" rel="stylesheet">

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
            </button>
            <a class="navbar-brand" href="#">JsTree Example</a>
        </div>
    </div>
</nav>

<div class="container">

    <div class="starter-template">
        <h1>Tree</h1>
        <div id="jstree">
            <!-- in this example the tree is populated from inline HTML -->
            <ul>
                <li>Root node 1
                    <ul>
                        <li id="child_node_1">Child node 1</li>
                        <li>Child node 2</li>
                    </ul>
                </li>
                <li>Root node 2</li>
            </ul>
        </div>
    </div>

</div><!-- /.container -->

<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.js"></script>
<script src="js/jstree.min.js"></script>
<script src="js/app.js"></script>
</body>
</html>