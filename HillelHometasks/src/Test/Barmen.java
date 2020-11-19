package Test;

import java.math.BigDecimal;

public class Barmen extends Staff{

    private BigDecimal tips;
    private boolean healthBook;
    private String systemCode;

    public BigDecimal getTips() {
        return tips;
    }

    public void setTips(BigDecimal tips) {
        this.tips = tips;
    }

    public boolean isHealthBook() {
        return healthBook;
    }

    public void setHealthBook(boolean healthBook) {
        this.healthBook = healthBook;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}
