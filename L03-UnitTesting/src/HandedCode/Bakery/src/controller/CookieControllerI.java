package HandedCode.Bakery.src.controller;

import HandedCode.Bakery.src.model.*;

public interface CookieControllerI {

    Dough prepareDough(Recipe recipe);

    Cookie[] makeCookies(Dough dough);
}
