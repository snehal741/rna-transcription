import java.sql.SQLOutput;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder st = new StringBuilder(dnaStrand);
        for(int i=0 ; i<st.length() ; i++){
            if(st.charAt(i) == 'G'){
                st.setCharAt(i, 'C');
            }
            else if(st.charAt(i) == 'C'){
                st.setCharAt(i, 'G');
            }
            else if(st.charAt(i) == 'T'){
                st.setCharAt(i, 'A');
            }
            else if(st.charAt(i) == 'A'){
                st.setCharAt(i, 'U');
            }

        }
        System.out.println(dnaStrand + " "+  st.toString());
        return st.toString();
    }

}
