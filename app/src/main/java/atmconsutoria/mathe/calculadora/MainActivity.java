package atmconsutoria.mathe.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {
private Button menos,mais,vezes,divisao,um,dois,tres,quatro,cinco,seis,sete,oito,nove,zero,igual;
private String expressaoRecebe="";
private ArrayList<String> expressao;
private ArrayList<String> expressaoPrecedencia;
private boolean sinal=true;
private EditText saida;
private int resolvendo=0;
private boolean qualNum=true;
private AlertDialog.Builder dialog;

// dialog "deseja trocar o sinal?????"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        expressao=new ArrayList<String>();
        expressaoPrecedencia=new ArrayList<String>();

        setContentView(R.layout.activity_main);
        menos=findViewById(R.id.botaoMenos_Id);
        menos.setOnClickListener( this);
        mais=findViewById(R.id.botaoMais_Id);
        mais.setOnClickListener( this);
        vezes=findViewById(R.id.botaoVezes_Id);
        vezes.setOnClickListener( this);
        divisao=findViewById(R.id.botaoDivisao_Id);
        divisao.setOnClickListener( this);
        um=findViewById(R.id.um_Id);
        um.setOnClickListener( this);
        dois=findViewById(R.id.dois_Id);
        dois.setOnClickListener( this);
        tres=findViewById(R.id.tres_Id);
        tres.setOnClickListener( this);
        quatro=findViewById(R.id.quatro_Id);
        quatro.setOnClickListener( this);
        cinco=findViewById(R.id.cinco_Id);
        cinco.setOnClickListener( this);
        seis=findViewById(R.id.seis_Id);
        seis.setOnClickListener( this);
        sete=findViewById(R.id.sete_Id);
        sete.setOnClickListener( this);
        oito=findViewById(R.id.oito_Id);
        oito.setOnClickListener( this);
        nove=findViewById(R.id.nove_Id);
        nove.setOnClickListener( this);
        zero=findViewById(R.id.zero);
        zero.setOnClickListener( this);
        igual=findViewById(R.id.igual_Id);
        igual.setOnClickListener( this);
        saida=findViewById(R.id.saida_Id);
        saida.setOnClickListener( this);

        saida.setText(" ");
        dialog =new AlertDialog.Builder(MainActivity.this);
        expressao.add("0");


       // expressao.add(0,"");


        // +++++++++++++++++++++++++++++++++++++++++++++++++++

        // ---------------------------------------------------


        //0000000000000000000000000000000000000000000000000
//        zero.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//           expressaoRecebe+="0";
//           saida.setText(saida.getText()+" 0");
//                sinal =true;
//
//
//
//            }
//        });
//        //111111111111111111111111111111111111111111111111
//        um.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="1";
//                saida.setText(saida.getText()+" 1");
//                sinal =true;
//
//
//
//            }
//        });
//
//        //22222222222222222222222222222222222222222222222222
////        dois.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                expressaoRecebe+="2";
////                saida.setText(saida.getText()+" 2");
////                sinal =true;
////
////
////            }
////        });
//
//        //33333333333333333333333333333333333333333333333333
//        tres.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="3";
//                saida.setText(saida.getText()+" 3");
//                sinal =true;
//
//
//
//            }
//        });
//
//        //444444444444444444444444444444444444444444444444
//        quatro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="4";
//                saida.setText(saida.getText()+" 4");
//                sinal =true;
//
//
//
//            }
//        });
//
//        //5555555555555555555555555555555555555555555555555
//        cinco.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="5";
//                saida.setText(saida.getText()+" 5");
//                sinal =true;
//
//
//            }
//        });
//        //666666666666666666666666666666666666666666666666
//        seis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="6";
//                saida.setText(saida.getText()+" 6");
//                sinal =true;
//
//
//
//            }
//        });
//        //77777777777777777777777777777777777777777777777777
//        sete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="7";
//                saida.setText(saida.getText()+" 7");
//                sinal =true;
//
//
//
//            }
//        });
//        //888888888888888888888888888888888888888888888888888
//        oito.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="8";
//                saida.setText(saida.getText()+" 8");
//                sinal =true;
//
//
//
//            }
//        });
//        //999999999999999999999999999999999999999999999999
//        nove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                expressaoRecebe+="9";
//                saida.setText(saida.getText()+" 9");
//                sinal =true;
//
//
//
//            }
//        });
//
//        igual.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            resolver();
//
//            }
//        });
//
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.botaoDivisao_Id:
                if (sinal==true) {
                    expressaoRecebe+="/";
                    saida.setText(saida.getText()+" /");
                    sinal =false;

                }
                else{
//                     chama dialog
                }

                break;

            case R.id.botaoVezes_Id:

                if (sinal==true) {
                    expressaoRecebe+="*";
                    saida.setText(saida.getText()+" *");
                    sinal =false;

                }
                else{
//                     chama dialog
                }
                break;

            case R.id.botaoMais_Id:
                if (sinal==true) {
                    expressaoRecebe+="+";
                    saida.setText(saida.getText()+" +");
                    sinal =false;

                }
                else{
//                     chama dialog
                }

            case  R.id.botaoMenos_Id:
                if (sinal==true) {
                    expressaoRecebe+="-";
                    saida.setText(saida.getText()+" -");
                    sinal =false;

                }
                else{
//                     chama dialog
                }
                break;
            case  R.id.igual_Id:
                resolver();
                break;
            default:{

                expressaoRecebe+=((Button)v).getText();
                saida.setText(saida.getText()+""+((Button)v).getText());
                sinal =true;
            }

        }}

public void precedencia (){

        armazenar();
        int a=0;

    while(expressao.size()!=expressaoPrecedencia.size()){
        for (int i=0;i<expressao.size();i++){

            if(expressao.get(i).equals("*")||expressao.get(i).equals("/")){
                if(expressaoPrecedencia.size()>=2) {
                    //                expressaoPrecedencia.add(a,expressao.get(i-1));
//                a++;
                    expressaoPrecedencia.add(a, expressao.get(i));
                    a++;
                    expressaoPrecedencia.add(a, expressao.get(i + 1));
                    a++;
                }else {

                    expressaoPrecedencia.add(a, expressao.get(i - 1));
                    a++;
                    expressaoPrecedencia.add(a, expressao.get(i));
                    a++;
                    expressaoPrecedencia.add(a, expressao.get(i + 1));
                    a++;
                }
            }
        }

        for (int i=0;i<expressao.size();i++){

            if(expressao.get(i).equals("+")||expressao.get(i).equals("-")) {
                if(expressaoPrecedencia.size()>=2){
//                expressaoPrecedencia.add(a,expressao.get(i-1));
//                a++;
                expressaoPrecedencia.add(a, expressao.get(i));
                a++;
                expressaoPrecedencia.add(a, expressao.get(i + 1));
                a++;
            }
            else{
                expressaoPrecedencia.add(a,expressao.get(i-1));
                a++;
                expressaoPrecedencia.add(a, expressao.get(i));
                a++;
                expressaoPrecedencia.add(a, expressao.get(i + 1));
                a++;
            }

            }
        }

         expressao.clear();
        for (String str:expressaoPrecedencia
                ) {
            expressao.add(str);

        }
      //  expressaoPrecedencia.clear();
//saida.setText(String.valueOf(expressaoPrecedencia.size()));
        saida.setText("");
    }
//        for (String str:expressao
//                ) {
//            saida.setText(saida.getText()+str);
//    }


}


public void armazenar(){
        String numeroMaior;
        Character auxiliar;
    int indice=expressao.size();
    expressao.add(expressao.size(),"");
    int i=0; int r=0;
        for(i=0; i<(expressaoRecebe.length()); i++){
            auxiliar=expressaoRecebe.charAt(i);

            if(verificar(auxiliar)){
                 if(expressao.get(indice).equals("")||expressao.get(indice).equals("0")){
                     expressao.set(indice,String.valueOf(auxiliar));

                     indice=expressao.size();
                     expressao.add(indice,"");

                      }
                 else{

                expressao.add(String.valueOf(auxiliar));
                     indice=expressao.size();

               // indice++;
                expressao.add(indice,"");
            }}
            else {



                numeroMaior =expressao.get(indice);
                numeroMaior+= String.valueOf(auxiliar);
                expressao.set(indice,numeroMaior);
            }

       // r++;
        }
//      saida.setText(String.valueOf(expressao.size()));
//    for (String str:expressao
//         ) {
//       saida.setText(saida.getText()+str);
//    }

}


        public void resolver(){

        precedencia();
            expressaoPrecedencia.clear();

        Character achar='z';

            for(int i=0; i<expressao.size(); i++){

                achar= expressao.get(i).charAt(0);
           //     saida.setText(String.valueOf(achar) );

             //   if(verificar(achar)) {

                    switch (achar){

                        case '-' :
                            resolvendo= (Integer.valueOf(expressao.get(i-1)))-(Integer.valueOf(expressao.get(i+1)));
                            expressao.set(i-1,String.valueOf(resolvendo));
                            expressao.remove((i+1));
                            expressao.remove(i);
                           saida.setText(String.valueOf(expressao.size()));
                            i--;
                            break;

                        case '+' :
                           resolvendo= (Integer.valueOf(expressao.get(i-1)))+(Integer.valueOf(expressao.get(i+1)));
                           expressao.set(i-i,String.valueOf(resolvendo));
                           expressao.get(i+1);
                            expressao.get(i);
                           expressao.remove((i+1));
                           expressao.remove(i);
                            i--;
                            break;
                        case '*' :
                            resolvendo= (Integer.valueOf(expressao.get(i-1)))*(Integer.valueOf(expressao.get(i+1)));
                            expressao.set(i-1,String.valueOf(resolvendo));
                            expressao.remove((i+1));
                            expressao.remove(i);
                            i--;

                            break;
                        case '/' :
                            resolvendo= (Integer.valueOf(expressao.get(i-1)))/(Integer.valueOf(expressao.get(i+1)));
                            expressao.set(i-1,String.valueOf(resolvendo));
                            expressao.remove((i+1));
                            expressao.remove(i);
                            i--;
                            break;

                        default:
                            break;
                   // }




            }

                sinal =true;

                qualNum=true;


        }               saida.setText(String.valueOf(resolvendo));


expressaoRecebe="";


}

    public boolean verificar(char testada){
        Character ultim= testada;
        if(ultim.equals('-')||ultim.equals('+')||ultim.equals('/')||ultim.equals('*')){


            return true;
        }
        return false;

            }


}
