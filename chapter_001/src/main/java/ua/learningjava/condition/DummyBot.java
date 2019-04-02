package ua.learningjava.condition;

/**
 * @author Avaltrois
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Answers the questions.
     * @param question Question from the client.
     * @return Фnswer.
     */
    public String answer(String question) {
        String rsl = "It baffles me. Ask another question.";
        if ("Hey Bot".equals(question)) {
            rsl ="Hello Man";
        } else if ("Bye Bot".equals(question)) {
            rsl ="Bye Man";
        }
        return rsl;
    }
}
