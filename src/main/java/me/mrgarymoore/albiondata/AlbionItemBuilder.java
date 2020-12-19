package me.mrgarymoore.albiondata;

public class AlbionItemBuilder {
    private final StringBuilder albionItems = new StringBuilder();

    public AlbionItemBuilder bag(Tier tier) {
        switch (tier) {
            case ONE:
                albionItems.append("T1_BAG,");
                break;
            case TWO:
                albionItems.append("T2_BAG,");
                break;
            case THREE:
                albionItems.append("T3_BAG,");
                break;
            case FOUR:
                albionItems.append("T4_BAG,");
                break;
            case FIVE:
                albionItems.append("T5_BAG,");
                break;
            case SIX:
                albionItems.append("T6_BAG,");
                break;
            case SEVEN:
                albionItems.append("T7_BAG,");
                break;
            case EIGHT:
                albionItems.append("T8_BAG,");
                break;
        }

        return this;
    }

    public String build() {
        return albionItems
                // Trim the trailing comma
                .deleteCharAt(albionItems.length() - 1)
                .toString();
    }
}