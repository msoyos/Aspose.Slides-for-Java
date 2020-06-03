package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class CloneAtEndOfAnotherSpecificPosition
{
    public static void main(String[] args)
    {
        //ExStart:CloneAtEndOfAnotherSpecificPosition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class to load the source presentation file
        Presentation srcPres = new Presentation(dataDir + "CloneAtEndOfAnotherSpecificPosition.pptx");
        try
        {
            // Instantiate Presentation class for destination presentation (where slide is to be cloned)
            Presentation destPres = new Presentation();
            try
            {
                // Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
                ISlideCollection slds = destPres.getSlides();

                // Clone the desired slide from the source presentation to the specified position in destination presentation
                slds.insertClone(1, srcPres.getSlides().get_Item(1));

                // Write the destination presentation to disk
                destPres.save(dataDir + "Aspose1_out.pptx", SaveFormat.Pptx);
            }
            finally
            {
                if (destPres != null) destPres.dispose();
            }
        }
        finally
        {
            if (srcPres != null) srcPres.dispose();
        }
        //ExEnd:CloneAtEndOfAnotherSpecificPosition
    }
}