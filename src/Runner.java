public class Runner {
    public static void main(String[] args) {
        Util_Doc doc = new Util_Doc("5556-kiTh-2598-abCm-8u9p");
        Util_Doc doc1 = new Util_Doc("1246-kiNh-2498-tiEm-8r7p");

        String s = Util_Doc.outputFirstBlock(doc.getDocNumber());
        String s1 = Util_Doc.outputFirstBlock(doc1.getDocNumber());
        System.out.println(s + s1);
        String s2 = Util_Doc.replaceLetters(doc1.getDocNumber());
        System.out.println(s2);
        Util_Doc.outputLetters1(doc1.getDocNumber());
        Util_Doc.outputLetters2(doc.getDocNumber());
        Util_Doc.checkCharactersDoc(doc1.getDocNumber());
        String s3 = Util_Doc.printMaxLongWorld("Круто!");
        System.out.println(s3);
        String s4 = Util_Doc.printMinLongWorld("Круто!");
        System.out.println(s4);
        Util_Doc.duplicateCharacters("Конец!");
    }
}