public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        for (int i = 0; i < sentences.length; i++) {
            if (seprateString(sentences[i], keywords)) {
                System.out.println(sentences[i]);
            }
        }

    }

    public static boolean seprateString(String str1, String[] keywords) {
        String str2 = "";
        char space = ' ';
        int i = 0;
        while (i < str1.length()) {
            if (str1.charAt(i) != space) {
                str2 = str2 + str1.charAt(i);
                i++;
            } else {
                //System.out.println("check " + str2);
                for (int j = 0; j < keywords.length; j++) {
                    //System.out.println(keywords[j]);
                    if (MyString.contains(str2.toLowerCase(), keywords[j].toLowerCase())) {
                        //System.out.println("FOUND !!!");
                        return true;
                    }
                }
                i++;
                str2 = "";
            }
        }
        return false;
    }

}
