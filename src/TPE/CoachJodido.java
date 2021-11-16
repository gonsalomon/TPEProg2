package TPE;

public class CoachJodido extends Coach {
    private Preference pref;

    public CoachJodido(String nombre, String apellido) {
        super(nombre, apellido);
        this.pref = new Preference();
    }

    @Override
    public void teamAdd(Participant p) {
        /*
         * los ints hacen la cuenta de cuántos langs,insts y gens tiene el participante
         * que coincidan con los que pide pref, se intentó hacerlo versátil
         */
        int prefLang = 0;
        int prefInst = 0;
        int prefGen = 0;

        for (String lang : pref.getLangs()) {
            if (p.getLangList().contains(lang))
                prefLang++;
        }

        for (String inst : pref.getInsts()) {
            if (p.getInstList().contains(inst))
                prefInst++;
        }

        for (String gen : pref.getGens()) {
            if (p.getGenList().contains(gen)) {
                prefGen++;
            }
        }

        if (prefLang == pref.getLangs().size() && prefInst == pref.getInsts().size()
                && prefGen == pref.getGens().size())
            super.teamAdd(p);
    }
}
