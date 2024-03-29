public class Loader {

    public static void main(String[]args){
        EnglichText("America’s music culture would be incomplete without blues music. Thought it was created in the early decades of the 20th century, blues music has had a huge influence on American popular music up to the present days. In fact, many key elements we hear in pop, soul, rhythm and blues, rock and roll, have their beginnings in blues music. It has never been the leader in music sales. Blues music has retained a significant presence not only in concerts and festivals throughout the United States, but in the daily life of every person on the planet, as well. One can hear the sound of the blues in unexpected places, from a television commercial to a new country or western song.\n" +
                "\n" +
                "The best known blues musician today is B.B. King. His fame is well-deserved. Born in Indianola, Mississippi in 1925, he earned the nickname \"B.B.\" (\"Blues boy\") while playing on radio programs in Memphis, Tennessee. From the 1940s through the 1960s, he played mostly in clubs in the South that had only black audiences. In 1948, he had a hit record with \"Three A.M. Blues\" and toured steadily thereafter. His fame spread as he played at blues festivals, concert halls, universities, and on television shows across the country. No other blues artist has worked harder, than B. B. King in his many years of playing over three hundred shows a year.\n" +
                "\n" +
                "By the late 1960s, B. B. had perfected his famous guitar style of vibrating the fingers of his left hand as he played, and bending notes to achieve the blues notes, that are such an integral part of blue music. This singing guitar sound, coupled with his expressive tenor voice, brought King great success in 1969 with the recording of \"The Thrill is Gone\". The song broke through the limited sales of the blues market to achieve mainstream success and brought B.B. a Grammy award.\n" +
                "\n" +
                "B.B’s songs display a wide range of emotions, in addition to the sadness, so fundamental to blue music. He combines humor with a keen understanding of human nature in \"Everybody Lies a Little Sometimes\" and \"How Blue Can You Get\".\n" +
                "\n" +
                "King’s long and distinguished career includes many musical collaborations. Young rock musicians, in particular, appreciate his contributions to their genre. In 1988 B.B. played guitar and sang on the hit song \"When Love Comes to Town\" by the Irish band U2. In 2001 he recorded an award-winning record with Eric Clapton called \"Riding with the King\"’.\n" +
                "\n" +
                "In a nutshell, King’s guitar work has had a strong influence on thousands of guitar soloists to this day. B.B. King remains the blues’ greatest ambassador.");
    }

    public static void EnglichText(String text){
        String words [] = text.split("[\\s* \\s*]");
        int wordsCount = words.length;
        for (int a = 0; a < wordsCount; a++) {
            System.out.println(words[a].trim());
        }
    }
}
