/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Acer
 */
   public class shuffle {
   static String[][] timeslots;
   static String slots[];
   static LinkedHashMap<String,String> courses=new LinkedHashMap();
   String teachers[];
   String classes[];
   int timeslotfinalized[];
   static int per,dmax,totslot;
   static ArrayList<String> daysofweek;
   static ArrayList<String>levels=new ArrayList();
   int countday[];
   static WritableWorkbook work=null;
    static     WritableCellFormat cellFormat;
    static     WritableCellFormat cellFormatBold;
     static    WritableCellFormat cellFormatBoldBorder;
    static     WritableCellFormat cellFormatBoldBorderCenter;
    static     WritableCellFormat cellFormatLocked = null ;
    static     WritableFont cellFormatFont = null ;
     static    WritableFont cellFormatNoFont = null ;
     static    WritableCellFormat cellFormatBoldUnderline;
     static    WritableFont cellFormatUnderline;
      static   WritableFont cellFormatUnderlineFail;
      static   WritableCellFormat cellFormatBoldUnderlineFail;
      static   JFileChooser ch;
   public shuffle()
   {
       
   }
   public static String headings(String tosearch)
   {
     Path p;
     String answer =null;
        try{
        p =Paths.get("school.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="SCHOOL INFORMATION";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("school.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(":");
           if(parts[0].trim().equals(tosearch))
           {
               answer=parts[1].trim();
               break;
           }
            }
        }
        
        }
        
        return answer;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return answer;
        }   
   }
   public static void colors_font()
    {
         cellFormatNoFont=new WritableFont( WritableFont.TIMES,11,WritableFont.NO_BOLD);
         cellFormatFont=new WritableFont( WritableFont.TIMES,11,WritableFont.BOLD);
         cellFormat = new WritableCellFormat(cellFormatNoFont);
         cellFormatBold = new WritableCellFormat(cellFormatFont);
         cellFormatBoldBorder = new WritableCellFormat(cellFormatFont);
         cellFormatBoldBorderCenter=new WritableCellFormat(cellFormatFont);
         cellFormatUnderlineFail=new WritableFont( WritableFont.TIMES,12,WritableFont.NO_BOLD,false,UnderlineStyle.DOUBLE);
         cellFormatUnderline=new WritableFont( WritableFont.TIMES,12,WritableFont.BOLD,false,UnderlineStyle.DOUBLE);
         try{
    cellFormat.setBorder(Border.LEFT, BorderLineStyle.THIN);
    cellFormat.setBorder(Border.RIGHT, BorderLineStyle.THIN);
    cellFormat.setBorder(Border.TOP, BorderLineStyle.THIN);
    cellFormat.setBorder(Border.BOTTOM, BorderLineStyle.THIN);
    //cellFormat.setWrap(true);
    cellFormatBoldBorder.setBorder(Border.LEFT, BorderLineStyle.THIN);
    cellFormatBoldBorder.setBorder(Border.RIGHT, BorderLineStyle.THIN);
    cellFormatBoldBorder.setBorder(Border.TOP, BorderLineStyle.THIN);
    cellFormatBoldBorder.setBorder(Border.BOTTOM, BorderLineStyle.THIN);
    //cellFormatBoldBorder.setWrap(true);
    cellFormatBoldBorderCenter.setBorder(Border.LEFT, BorderLineStyle.THIN);
    cellFormatBoldBorderCenter.setBorder(Border.RIGHT, BorderLineStyle.THIN);
    cellFormatBoldBorderCenter.setBorder(Border.TOP, BorderLineStyle.THIN);
    cellFormatBoldBorderCenter.setBorder(Border.BOTTOM, BorderLineStyle.THIN);
    cellFormatBoldBorderCenter.setAlignment(Alignment.CENTRE);
    //cellFormatBoldBorder.setLocked(false);
    cellFormatBoldUnderline=new WritableCellFormat(cellFormatUnderline);
     cellFormatBoldUnderlineFail=new WritableCellFormat(cellFormatUnderlineFail);
     cellFormatBoldUnderlineFail.setBorder(Border.LEFT, BorderLineStyle.THIN);
    cellFormatBoldUnderlineFail.setBorder(Border.RIGHT, BorderLineStyle.THIN);
    cellFormatBoldUnderlineFail.setBorder(Border.TOP, BorderLineStyle.THIN);
    cellFormatBoldUnderlineFail.setBorder(Border.BOTTOM, BorderLineStyle.THIN);
    // cellFormatBoldUnderline.setUnderlineStyle(UnderlineStyle.DOUBLE);
    //cellFormatLocked.setLocked(true);
    //cellFormatFont.setBoldStyle(WritableFont.BOLD);
         }
         catch(WriteException e)
         {
             JOptionPane.showMessageDialog(null,e);
         }

    }
  public void load()
  {
     daysofweek d;
     d=new daysofweek();
     d.setVisible(true);
  }
  public static String getlevelcode(String passcode)
  {
      String code = null;
      Path p;
        try{
        p =Paths.get("level.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="LEVELS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("level.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
            String [] parts;
            parts=search.split(",");
            if(parts[1].trim().equals(passcode))
            {
            code=parts[0].trim();
            
            }
            }
        }
        }
        return code;
        }
        catch(IOException e)
                {
                JOptionPane.showConfirmDialog(null, e);
                return code;
                }
       
  }
  public static void getshuffle()
  {
      Path p;
        try{
        p =Paths.get("level.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="LEVELS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("level.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
            String [] parts;
            parts=search.split(",");
            levels.add(parts[1].trim());
            }
        }
        totslot=per*levels.size()*daysofweek.size();
        slots=new String[totslot];
        timeslots=new String[per][levels.size()];
        int size=0;
        //loop for the days of the week
            for (String daysofweek1 : daysofweek) 
            {
                //loop to allocate subject on period
                for(int j=0;j<per;j++)
                {
                    
                    //loop to allocate the subject into class
                    for(int k=0;k<levels.size();k++)
                    {
                       ArrayList<String> modules=new ArrayList();
                        //loop to get the module code
                        for(String str:courses.keySet())
                        {
                            if(courses.get(str).equals(levels.get(k)))
                            {
                                modules.add(str);
                            }
                        }
                     int tot;
                        int m;
                        int max;
                        boolean reached,dreached,seen,done,on;
                        if(size<totslot)
                        {
                        if(modules.size()>=1)
                        {
                            //check if the subject has not reach the maximum periods per day
                            for(m=0;m<modules.size();m++)
                            {
                                max=0;
                                tot=0;
                                dreached=false;
                             reached=false; 
                             seen=false;
                             done=false;
                             on=false;
                         for(int mw=0;mw<=size;mw++)
                            {
                                if(slots[mw]!=null)
                                {
                                if(slots[mw].equals(modules.get(m)))
                                {
                                    max++;
                                }
                                }
                            if(max>=searchcourse(modules.get(m)))
                            {
                                reached=true;
                            } 
                            }
                            
                            String currentteacher;
                            String teacher,dayoff;
                            currentteacher=getteacher(modules.get(m)); 
                            for(int o=0;o<k;o++)
                            {
                              teacher= getteacher(timeslots[j][o]);
                              if(currentteacher.equals(teacher))
                              {
                                seen=true;
                                break;
                              }
                            }
                            dayoff=dayoffs(currentteacher);
                            if(dayoff.equals(daysofweek1))
                            {
                                on=true;
                            }
                              for(int count=0;count<j;count++)
                                {
                                    if(timeslots[count][k]!=null )
                                    {
                                        if(timeslots[count][k].equals(modules.get(m)))
                                        {
                                            tot++;
                                        }
                                    }
                                    if(tot>=dmax)
                                   {
                                dreached=true;
                                   }
                                }

                           if(seen==false && reached==false && dreached==false && on==false)
                           {
                            timeslots[j][k]=modules.get(m);
                            slots[size]=modules.get(m);
                             done=true;
                           }
                             if(done==true)
                             {
                                break; 
                             }
                            }
                        }
                        else
                        {
                        timeslots[j][k]="";
                        slots[size]="";
                        }
                     if(timeslots[j][k]==null) 
                     {
                       slots[size]="";
                     }
                     
                     size++;  
                    }
                     
                    }
                }
            }
        }
        generate();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
  }
  public static void generate()
  {
      colors_font();
       ch=new JFileChooser();
                 ch.setDialogTitle("Choose a folder");
                 ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                 ch.showSaveDialog(null);
                 File pt=ch.getSelectedFile();
                
             File f;
             try{
             f=new File(pt+"\\timetable.xls");
             work = Workbook.createWorkbook(f);
             WritableSheet sheet=work.createSheet("timetable",0);
             Label head = null;
             head=new Label(0,0,"WEEKLY TIMETABLE",cellFormatBold) ;
             sheet.addCell(head);
             head=new Label(0,1,"School name:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 1, 1, 1);
             head=new Label(2,1,headings("Name"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 1, 3, 1);
             head=new Label(0,2,"Telephone:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 2, 1, 2);
             head=new Label(2,2,headings("Telephone"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 2, 3, 2);
             head=new Label(0,3,"Email:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 3, 1, 3);
             head=new Label(2,3,headings("Email"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 3, 3, 3);
             int ro=7;
             for(int hours=1;hours<=per;hours++)
             {
             head=new Label(0,ro,String.valueOf(hours),cellFormatBoldBorder) ;
             sheet.addCell(head);  
             ro++;
             }
             int col=1,row = 5,cols=1;
             for(String daycount:daysofweek)
             {
                 row=5;
                 head=new Label(col,row,daycount,cellFormatBoldBorder) ;
                 sheet.addCell(head);
                 sheet.mergeCells(col, row, col+levels.size()-1, row);
                 row++;
                 for(String lev:levels)
                 {
                    head=new Label(col,row,getlevelcode(lev),cellFormatBoldBorder) ;
                    sheet.addCell(head);
                    col++;
                 }
             }
              int s=0;
              for(String dy:daysofweek)
              {
                  
                  row=7;
                 for(int pr=0;pr<per;pr++)
                 {
                     col=cols;
                 for(String level:levels)
                 {
                   head=new Label(col,row,slots[s],cellFormat) ;
                   sheet.addCell(head);
                   s++;
                   col++;
                 }
                 row++;
                 }
                 cols=cols+levels.size();
              }
             
             work.write();
            work.close();
            generate_teacher();
             }
             catch(IOException | WriteException e)
             {
                 JOptionPane.showMessageDialog(null, e);
             }
  }
  public static void generate_level()
  {
     colors_font();
       ch=new JFileChooser();
                 ch.setDialogTitle("Choose a folder");
                 ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                 ch.showSaveDialog(null);
                 File pt=ch.getSelectedFile();
                int nber=0;
             File f;
             try
             {
             f=new File(pt+"\\timetable_class.xls");
             work = Workbook.createWorkbook(f);
             Path p;
        p =Paths.get("level.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="LEVELS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("level.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
           
            if(is && !search.isEmpty())
            {
             String parts[]=search.split(",");
              WritableSheet sheet=work.createSheet(parts[1].trim(),nber);
             Label head = null;
              head=new Label(0,0,"WEEKLY TIMETABLE",cellFormatBold) ;
             sheet.addCell(head);
             head=new Label(0,1,"School name:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 1, 1, 1);
             head=new Label(2,1,headings("Name"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 1, 3, 1);
             head=new Label(0,2,"Telephone:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 2, 1, 2);
             head=new Label(2,2,headings("Telephone"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 2, 3, 2);
             head=new Label(0,3,"Email:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 3, 1, 3);
             head=new Label(2,3,headings("Email"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 3, 3, 3);
             head=new Label(0,4,"Class:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 4, 1, 4);
             head=new Label(2,4,parts[1].trim(),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 4, 3, 4);
             int ro=7;
             for(int hours=1;hours<=per;hours++)
             {
             head=new Label(0,ro,String.valueOf(hours),cellFormatBoldBorder) ;
             sheet.addCell(head);  
             ro++;
             }
             int col=1,row = 6,cols=1;
             String c;
             for(String daycount:daysofweek)
             {
                 row=6;
                 head=new Label(col,row,daycount,cellFormatBoldBorder) ;
                 sheet.addCell(head);
                 row=7;
                 for(int i=0;i<per;i++)
                 {
                     head=new Label(col,row,"",cellFormat) ;
                 sheet.addCell(head);
                  row++;   
                 }
                 col++;
             }
              int si=0;
              for(String dy:daysofweek)
              {
                  row=7;
                 for(int pr=0;pr<per;pr++)
                 {
                     col=cols;
                 for(String level:levels)
                 {
                     
                     if(whichcourse(slots[si],parts[1].trim())!=null && whichcourse(slots[si],parts[1].trim()).equals(slots[si]))
                     {
                   head=new Label(col,row,slots[si],cellFormat) ;
                   sheet.addCell(head);
                   col++; 
                     }
                   si++;
                 }
                 row++;
                 }
                 cols++;
              }
            }
            nber++;
        }
        }
        JOptionPane.showMessageDialog(null, "Timetable well generated");
             work.write();
            work.close();
             }
             catch(IOException | WriteException e)
             {
                 JOptionPane.showMessageDialog(null, e);
             } 
  }
  public static void generate_teacher()
  {
      colors_font();
       ch=new JFileChooser();
                 ch.setDialogTitle("Choose a folder");
                 ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                 ch.showSaveDialog(null);
                 File pt=ch.getSelectedFile();
                int nber=0;
             File f;
             try
             {
             f=new File(pt+"\\timetable_teachers.xls");
             work = Workbook.createWorkbook(f);
             Path p;
        p =Paths.get("trainer.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="TRAINERS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("trainer.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
           
            if(is && !search.isEmpty())
            {
                String parts[]=search.split(",");
                
             WritableSheet sheet=work.createSheet(parts[1].trim(),nber);
             Label head = null;
             head=new Label(0,0,"WEEKLY TIMETABLE",cellFormatBold) ;
             sheet.addCell(head);
             head=new Label(0,1,"School name:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 1, 1, 1);
             head=new Label(2,1,headings("Name"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 1, 3, 1);
             head=new Label(0,2,"Telephone:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 2, 1, 2);
             head=new Label(2,2,headings("Telephone"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 2, 3, 2);
             head=new Label(0,3,"Email:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 3, 1, 3);
             head=new Label(2,3,headings("Email"),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 3, 3, 3);
             head=new Label(0,4,"Teacher:",cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(0, 4, 1, 4);
             head=new Label(2,4,parts[1].trim(),cellFormatBold) ;
             sheet.addCell(head);
             sheet.mergeCells(2, 4, 3, 4);
             int ro=7;
             for(int hours=1;hours<=per;hours++)
             {
             head=new Label(0,ro,String.valueOf(hours),cellFormatBoldBorder) ;
             sheet.addCell(head);  
             ro++;
             }
             int col=1,row = 6,cols=1;
             String c;
             for(String daycount:daysofweek)
             {
                 row=6;
                 head=new Label(col,row,daycount,cellFormatBoldBorder) ;
                 sheet.addCell(head);
                 row=7;
                 for(int i=0;i<per;i++)
                 {
                     head=new Label(col,row,"",cellFormat) ;
                 sheet.addCell(head);
                  row++;   
                 }
                 col++;
             }
              int si=0;
              for(String dy:daysofweek)
              {
                  row=7;
                 for(int pr=0;pr<per;pr++)
                 {
                     col=cols;
                 for(String level:levels)
                 {
                     
                     if(searchcourse(slots[si],parts[1].trim())!=null && searchcourse(slots[si],parts[1].trim()).equals(slots[si]))
                     {
                   head=new Label(col,row,slots[si],cellFormat) ;
                   sheet.addCell(head);
                   col++; 
                     }
                   si++;
                    
                 }
                 row++;
                 }
                 cols++;
              }
            }
            nber++;
        }
        }
        
             work.write();
            work.close();
            generate_level();
             }
             catch(IOException | WriteException e)
             {
                 JOptionPane.showMessageDialog(null, e);
             }
  }
  public static String dayoffs(String code)
  {
   Path p;
     String dayoff =null;
        try{
        p =Paths.get("trainer.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="TRAINERS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("trainer.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(",");
           if(parts[1].trim().equals(code))
           {
               dayoff=parts[2].trim();
               break;
           }
            }
        }
        
        }
        
        return dayoff;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return dayoff;
        }      
  }
  public static String getteacher(String code)
  {
     Path p;
     String teacher =null;
        try{
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("module.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(",");
           if(parts[0].trim().equals(code))
           {
               teacher=parts[5].trim();
               break;
           }
            }
        }
        
        }
        
        return teacher;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return teacher;
        }   
  }
  public static String whichcourse(String code,String level)
  {
   Path p;
     String course =null;
        try{
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("module.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(",");
           if(parts[0].trim().equals(code) && parts[4].trim().equals(level))
           {
               course=parts[0].trim();
               break;
           }
            }
        }
        
        }
        
        return course;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return course;
        }     
  }
  public static String searchcourse(String code,String teacher)
  {
      Path p;
     String course =null;
        try{
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("module.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(",");
           if(parts[0].trim().equals(code) && parts[5].trim().equals(teacher))
           {
               course=parts[0].trim();
               break;
           }
            }
        }
        
        }
        
        return course;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return course;
        }  
  }
  public static void getcourses()
  {
     Path p;
        try{
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("module.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(",");
           courses.put(parts[0].trim(),parts[4].trim());
            }
        }
        
        }
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
  }
  public static int searchcourse(String se)
  {
     Path p;
     int periods = 0;
        try{
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("module.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
            if(is && !search.isEmpty())
            {
                String [] parts;
                parts=search.split(",");
           if(parts[0].trim().equals(se))
           {
               periods=Integer.parseInt(parts[2].trim());
               break;
           }
            }
        }
        
        }
        
        return periods;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return periods;
        }  
  }
   public static void getdaysofweeks(ArrayList<String> days,int periods,int maxday)
   {
     dmax=maxday;
     daysofweek=days;
     per=periods;
     getcourses();
     getshuffle();
   
   }
   public static void main(String args[])
   {
       
   }
    
}
