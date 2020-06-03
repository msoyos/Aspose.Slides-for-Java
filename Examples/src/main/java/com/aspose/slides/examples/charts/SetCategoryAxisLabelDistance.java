package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetCategoryAxisLabelDistance
{
    public static void main(String[] args)
    {
        //ExStart:SetCategoryAxisLabelDistance
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation();

        // Get reference of the slide
        ISlide sld = presentation.getSlides().get_Item(0);

        // Adding a chart on slide
        IChart ch = sld.getShapes().addChart(ChartType.ClusteredColumn, 20, 20, 500, 300);

        // Setting the position of label from axis
        ch.getAxes().getHorizontalAxis().setLabelOffset(500);

        // Write the presentation file to disk
        presentation.save(dataDir + "SetCategoryAxisLabelDistance_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetCategoryAxisLabelDistance
    }
}