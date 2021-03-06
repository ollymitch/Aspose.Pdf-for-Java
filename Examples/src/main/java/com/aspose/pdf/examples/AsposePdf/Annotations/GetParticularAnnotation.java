package com.aspose.pdf.examples.AsposePdf.Annotations;

import com.aspose.pdf.examples.Utils;

public class GetParticularAnnotation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetParticularAnnotation.class);

        //open source PDF document
        com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document(dataDir + "input.pdf");

        //get particular annotation
        com.aspose.pdf.TextAnnotation textAnnotation = (com.aspose.pdf.TextAnnotation)pdfDocument.getPages().get_Item(1).getAnnotations().get_Item(1);

        //get annotation properties
        System.out.printf("Title :- " + textAnnotation.getTitle());
        System.out.printf("Subject :-  " + textAnnotation.getSubject());
        System.out.printf("Contents :- " + textAnnotation.getContents());


    }
}

