class Loop2{
  public static void main(String[] args){
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;
// 文字列もname内に0から格納している
    String[] name = {"菅原", "村山", "高橋"};

    for(int i = 0; i < score.length; i++){
      System.out.println(name[i] + "さん：" + score[i] + "点");
    }
    System.out.println("受験者数" + score.length + "名");
  }
}