public class AlunoSenaiClass {
    private String uniforme;
    private boolean aapm;
    private String rm;

    public AlunoSenaiClass(String uniforme, boolean aapm, String rm) {

        this.aapm = aapm;
        this.rm = rm;
        this.uniforme = uniforme;
    }

    public String getUniforme() {
        return uniforme;
    }

    public boolean isAapm() {
        return aapm;
    }

    public String getRm() {
        return rm;
    }

    public void setUniforme(String uniforme) {
        this.uniforme = uniforme;
    }

    public void setAapm(boolean aapm) {
        this.aapm = aapm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }
}
