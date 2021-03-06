package com.aspose.slides.examples.asposefeatures.smartart.removenodes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArt;
import com.aspose.slides.SmartArtNodeCollection;
import com.aspose.slides.examples.Utils;

public class AsposeRemoveSmartArtNodes
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeRemoveSmartArtNodes.class);
        
	// ====================
	// Removing Smart Art
	// ====================

	// Load the desired the presentation
	Presentation pres = new Presentation(dataDir + "AsposeAddSmartArtNode.pptx");

	// Traverse through every shape inside first slide
	for (IShape shape : pres.getSlides().get_Item(0).getShapes())
	{

	    // Check if shape is of SmartArt type
	    if (shape instanceof ISmartArt)
	    {
		// Typecast shape to SmartArtEx
		ISmartArt smart = (ISmartArt) shape;

		if (smart.getAllNodes().size() > 0)
		{
		    // Accessing SmartArt node at index 0
		    ISmartArtNode node = smart.getAllNodes().get_Item(0);

		    // Removing the selected node
		    smart.getAllNodes().removeNode(node);

		}
	    }
	}

	// Save Presentation
	pres.save(dataDir + "AsposeRemoveSmartArtNode.pptx", SaveFormat.Pptx);

	// ============================================
	// Removing Smart Art from Specific Location
	// ============================================

	// Load the desired the presentation
	Presentation pres1 = new Presentation(dataDir + "AsposeAddSmartArtNodeByPosition.pptx");

	// Traverse through every shape inside first slide
	for (IShape shape : pres1.getSlides().get_Item(0).getShapes())
	{

	    // Check if shape is of SmartArt type
	    if (shape instanceof SmartArt)
	    {
		// Typecast shape to SmartArt
		SmartArt smart = (SmartArt) shape;

		if (smart.getAllNodes().size() > 0)
		{
		    // Accessing SmartArt node at index 0
		    ISmartArtNode node = smart.getAllNodes().get_Item(0);

		    if (node.getChildNodes().size() >= 2)
		    {
			// Removing the child node at position 1
			((SmartArtNodeCollection) node.getChildNodes()).removeNodeByPosition(1);
		    }
		}
	    }
	}
	// Save Presentation
	pres1.save(dataDir + "AsposeRemoveSmartArtNodeByPosition.pptx", SaveFormat.Pptx);
        
	System.out.println("Smart Art removed.");
    }
}
