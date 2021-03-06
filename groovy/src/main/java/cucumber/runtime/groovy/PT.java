package cucumber.runtime.groovy;

import groovy.lang.Closure;

import java.util.regex.Pattern;

public class PT {
    public static void Dado(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.addStepDefinition(regexp, body);
    }

    public static void Quando(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.addStepDefinition(regexp, body);
    }

    public static void Então(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.addStepDefinition(regexp, body);
    }

    public static void Entao(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.addStepDefinition(regexp, body);
    }

    public static void E(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.addStepDefinition(regexp, body);
    }

    public static void Mas(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.addStepDefinition(regexp, body);
    }

}
