package TPE;

public class FinaleSong extends Song {
    private int required;// cantidad de instrumentos necesarios para poder tocarlo

    public FinaleSong(String title, int required) {
        super(title);
        this.required = required;
    }

    @Override
    public boolean canPerformIt(Participant p) {
        if (p.getLangList().containsAll(this.langList)) {
            int canPlay = 0;// instrumentos que p PUEDE tocar entre los que requiere el tema
            for (String inst : this.instList) {
                if (p.getInstList().contains(inst)) {
                    canPlay++;
                }
            }
            for (String gen : this.genList) {
                if (p.getGenList().contains(gen)) {
                    return canPlay >= required;
                }
            }
        }
        return false;
    }
}
