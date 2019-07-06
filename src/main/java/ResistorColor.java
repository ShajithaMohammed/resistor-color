class ResistorColor {

    String[] colorCodes = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int code = 0;

        for (int i = 0; i < colorCodes.length; i++) {
            if (colorCodes[i].equals(color)) {
                code = i;
                break;
            }
        }

        return code;
    }

    String[] colors() {
        return colorCodes;
    }
}
