package Prog875s;

public class FASTA implements Sequence{
    private String header;
    private String sequence;

    public FASTA (String header, String sequence){
        this.header = header;
        this.sequence = sequence;
    }

    public boolean compare(FASTA other){
        return this.header.equals(other.getHeader()) &&
                this.sequence.equals(other.getSequence());
    }

    public String getHeader(){return header;}
    public String getSequence(){return sequence;}
}
