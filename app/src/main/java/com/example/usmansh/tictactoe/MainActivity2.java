package com.example.usmansh.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends Activity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,exit;
    int turn,plr,win=0;
    Boolean tick1 = false,tick2 = false,tick3 = false,tick4 = false,tick5 = false,tick6 = false,tick7 = false,tick8 = false,tick9 = false;
    Boolean buttonpress1 = false,buttonpress2 = false,buttonpress3 = false,buttonpress4 = false,buttonpress5 = false,buttonpress6 = false,buttonpress7 = false,buttonpress8 = false,buttonpress9 = false;


//function
    public void gamecontrol()

    {
        if (turn %2 == 0)
        {

            plr = 1;

        }

        else
        {
            plr = 2;
        }

        turn++;

    }



    public void check()

    {


       if( b1.getBackground().getConstantState().equals(b2.getBackground().getConstantState()) && b2.getBackground().getConstantState().equals(b3.getBackground().getConstantState()))


        {

            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if ( b1.getBackground().getConstantState().equals(b5.getBackground().getConstantState()) && b5.getBackground().getConstantState().equals(b9.getBackground().getConstantState()))

        {
            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }


        else if (  b1.getBackground().getConstantState().equals(b4.getBackground().getConstantState()) && b4.getBackground().getConstantState().equals(b7.getBackground().getConstantState()))

        {
            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if (  b3.getBackground().getConstantState().equals(b5.getBackground().getConstantState()) && b5.getBackground().getConstantState().equals(b7.getBackground().getConstantState()))

        {
            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if (  b3.getBackground().getConstantState().equals(b6.getBackground().getConstantState()) && b6.getBackground().getConstantState().equals(b9.getBackground().getConstantState()))

        {
            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if (  b7.getBackground().getConstantState().equals(b8.getBackground().getConstantState()) && b8.getBackground().getConstantState().equals(b9.getBackground().getConstantState()))

        {
            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if (  b2.getBackground().getConstantState().equals(b5.getBackground().getConstantState()) && b5.getBackground().getConstantState().equals(b8.getBackground().getConstantState()))

        {
            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if ( b4.getBackground().getConstantState().equals(b5.getBackground().getConstantState()) && b5.getBackground().getConstantState().equals(b6.getBackground().getConstantState()))

        {

            Toast.makeText(this.getApplicationContext(),"Player "+plr+" Has Won ",Toast.LENGTH_LONG).show();
            win = 1;
        }

        else if (buttonpress1 == true && buttonpress2 == true && buttonpress3 == true && buttonpress4 == true && buttonpress5 == true &&
                 buttonpress5 == true && buttonpress6 == true && buttonpress7 == true && buttonpress8 == true && buttonpress9 == true)

       {
           Toast.makeText(this.getApplicationContext(),"The Game is Drawn ",Toast.LENGTH_LONG).show();
           win = 1;

       }



    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        reset = (Button)findViewById(R.id.reset);
        exit = (Button)findViewById(R.id.exit);


        Random rand = new Random();
        turn = rand.nextInt()%2;


         if (turn %2 == 0)
        {
            Toast.makeText(this.getApplicationContext(),"Player 1 turn",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(this.getApplicationContext(),"Player 2 turn",Toast.LENGTH_SHORT).show();
        }



        b1.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v) {

                check();

                if (buttonpress1 == false)

                {
                    if (win != 1)

                    {
                        gamecontrol();


                        if (plr == 1 && tick1 == false) {
                            b1.setBackgroundResource(R.drawable.tick);
                            tick1 = true;
                        } else if (plr == 2 && tick1 == false) {
                            b1.setBackgroundResource(R.drawable.cross);
                        }
                        tick1 = true;
                    }


                    buttonpress1 = true;
                }


                else if ( win == 1)
                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }
            }
        });

        b2.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {

                check();

                if (buttonpress2 == false)
                {

                    if (win != 1) {
                        gamecontrol();


                        if (plr == 1 && tick2 == false) {
                            b2.setBackgroundResource(R.drawable.tick);
                            tick2 = true;
                        } else if (plr == 2 && tick2 == false) {
                            b2.setBackgroundResource(R.drawable.cross);
                            tick2 = true;
                        }


                    }

                    buttonpress2 = true;

                }

                else if ( win == 1)
                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }


            }
        });


        b3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {


                check();

                if (buttonpress3 == false && win !=1)

                {
                        gamecontrol();

                        if (plr == 1 && tick3 == false) {
                            b3.setBackgroundResource(R.drawable.tick);
                            tick3 = true;
                        } else if (plr == 2 && tick3 == false) {
                            b3.setBackgroundResource(R.drawable.cross);
                            tick3 = true;
                        }



                    buttonpress3 = true;
                }



                else if(win==1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }



            }

        });


        b4.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {

                check();

                if (buttonpress4 == false  && win !=1) {

                        gamecontrol();


                        if (plr == 1 && tick4 == false) {
                            b4.setBackgroundResource(R.drawable.tick);
                            tick4 = true;
                        } else if (plr == 2 && tick4 == false) {
                            b4.setBackgroundResource(R.drawable.cross);
                            tick4 = true;
                        }

                    buttonpress4 = true;
                }


                else if(win==1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }
            }
        });


        b5.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v) {

                check();

                if (buttonpress5 == false  && win !=1)

                {

                    gamecontrol();

                        if (plr == 1 && tick5 == false) {
                            b5.setBackgroundResource(R.drawable.tick);
                            tick5 = true;
                        } else if (plr == 2 && tick5 == false) {
                            b5.setBackgroundResource(R.drawable.cross);
                            tick5 = true;
                        }


                    buttonpress5 = true;

                }


                else if(win==1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }


            }
        });


        b6.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v) {


                check();

                if (buttonpress6 == false  && win !=1) {


                        gamecontrol();


                        if (plr == 1 && tick6 == false) {
                            b6.setBackgroundResource(R.drawable.tick);
                            tick6 = true;
                        } else if (plr == 2 && tick6 == false) {
                            b6.setBackgroundResource(R.drawable.cross);
                            tick6 = true;
                        }

                    buttonpress6 = true;

                }

                else if(win==1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }
            }
        });


        b7.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v) {

                check();


                if (buttonpress7 == false  && win !=1)

                {

                        gamecontrol();

                        if (plr == 1 && tick7 == false) {
                            b7.setBackgroundResource(R.drawable.tick);
                            tick7 = true;
                        } else if (plr == 2 && tick7 == false) {
                            b7.setBackgroundResource(R.drawable.cross);
                            tick7 = true;
                        }

                     buttonpress7 = true;

                }

                else if(win==1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }
            }
        });


        b8.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v) {


                check();

                if (buttonpress8 == false  && win !=1)

                {
                    gamecontrol();

                        if (plr == 1 && tick8 == false) {
                            b8.setBackgroundResource(R.drawable.tick);
                            tick8 = true;
                        } else if (plr == 2 && tick8 == false) {
                            b8.setBackgroundResource(R.drawable.cross);
                            tick8 = true;
                        }


                    buttonpress8 = true;

                }

                else if(win==1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }
            }
        });


        b9.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {


                check();

                if (buttonpress9 == false  && win !=1)

                {
                        gamecontrol();


                        if (plr == 1 && tick9 == false) {
                            b9.setBackgroundResource(R.drawable.tick);
                            tick9 = true;
                        } else if (plr == 2 && tick9 == false) {
                            b9.setBackgroundResource(R.drawable.cross);
                            tick9 = true;
                        }


                    buttonpress9 = true;
                }


                else if(win == 1)

                {

                    finish();
                    Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                    startActivity(intt);

                }

            }
        });


        reset.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {

                finish();
                Intent intt = new Intent(reset.getContext(), MainActivity2.class);
                startActivity(intt);
            }
        });



        exit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intt = new Intent(exit.getContext(),MainActivity1.class);

                Toast.makeText(exit.getContext(),"Going Back To Main Menu",Toast.LENGTH_SHORT).show();

                startActivity(intt);
            }
        });


    }



}
