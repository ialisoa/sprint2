package mg.teste;

import mg.framework.annotations.HandleURL;

public class Test {
    @HandleURL("/hello")
    public void hello() {}

    @HandleURL("/teste")
    public void about() {}
}