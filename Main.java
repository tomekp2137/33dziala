class Main {
  public static void main(String[] args) {
    int zlicz = 0;
    char[] tab = {'a', 'B', 'C', 'D', 'e', 'F', 'g', 'H',};
    for (int i=0; i<tab.length; i++) {
      if (Character.isLowerCase(tab[i]) && Character.isUpperCase(tab[i+1])) zlicz++;
    }
    System.out.println(zlicz);
  }
}