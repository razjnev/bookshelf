package controllers;

import models.bookshelf.Bookshelf;
import org.codehaus.jackson.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result bookshelf() {
        ObjectNode result = Json.newObject();
        result.put("success", true);
        result.put("bookshelf", Json.toJson(new Bookshelf()));
        return ok(result);
    }

}
