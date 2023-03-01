public class Main {
    public static void main(String[] args){
        String strToEncrypt1 = "What are you doing next weekend?";
        Encryptor encryptor1 = new Encryptor(3, 4);
        System.out.println(encryptor1.encryptMessage(strToEncrypt1));

        String strToEncrypt2 = "This one time I was trying to do a handstand " +
                "and fell backwards and landed on my shoe. It hurt! " +
                "I won't try that again.";
        Encryptor encryptor2 = new Encryptor(6, 5);
        System.out.println(encryptor2.encryptMessage(strToEncrypt2));





        String strToDecrypt1 = "Ti hsiscn ofietdnia!Bl e nto helo okotAu!A";
        Encryptor encryptor3 = new Encryptor(3,2);
        System.out.println(encryptor3.decryptMessage(strToDecrypt1));

        String strToDecrypt2 = "Tite hsocmi presa es  stsaneregtd see J  " +
                "nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA";
        Encryptor encryptor4 = new Encryptor(5,5);
        System.out.println(encryptor4.decryptMessage(strToDecrypt2));

        String strToDecrypt3 = "Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen" +
                "    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA";
        Encryptor encryptor5 = new Encryptor(6,5);
        System.out.println(encryptor5.decryptMessage(strToDecrypt3));

        String strToDecrypt4 = "Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp " +
                "ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro " +
                "nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai " +
                "stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  " +
                "xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf " +
                "lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw " +
                "pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc " +
                "eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  " +
                "r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi " +
                "te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  " +
                "eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit " +
                "reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA";
        Encryptor encryptor6 = new Encryptor(9,8);
        System.out.println(encryptor6.decryptMessage(strToDecrypt4));

        String myMessage = "Break was way too short and March is too long";
        Encryptor encryptor7 = new Encryptor(3,5);
        System.out.println(encryptor7.encryptMessage(myMessage));

        String str = "StowfarEen gienreinbge sta jmorAAAAA";
        Encryptor encryptor8 = new Encryptor(2,3);
        System.out.println(encryptor8.decryptMessage(str));

        String str2= "We rnhntaspatn lnigsedig,elns cnidtade eaoswlpt il aetemk h ts aiakeser a o.Dntoktede h ep iedwdv on h abterbithl.A oeAA";
        Encryptor encryptor9 = new Encryptor(5,2);
        System.out.println(encryptor9.decryptMessage(str2));



    }
}
