package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * There is no constructor function for ILabel. To get ILabel instance use the
	 * dymo.label.framework.openLabelFile or dymo.label.framework.openLabelXml function.
	 * ILabel provides methods for manipulating label content, such as set address or text
	 * on the label.
	 */
trait ILabel extends js.Object {
  /**
  		 * Gets the Intelligent Mail barcode position for an Address object.
  		 *
  		 * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
  		 *
  		 * @returns A string with one of the values defined by the dymo.label.framework.AddressBarcodePosition enumeration.
  		 */
  def getAddressBarcodePosition(addressIndex: scala.Double): AddressBarcodePosition
  /**
  		 * Gets the number of Address objects on the label.
  		 */
  def getAddressObjectCount(): scala.Double
  /**
  		 * Gets the text content of an Address object.
  		 *
  		 * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
  		 *
  		 * @returns The plain text from the Address object.
  		 */
  def getAddressText(addressIndex: scala.Double): java.lang.String
  /**
  		 * Returns the current label as an XML string. The returned XML string can be passed
  		 * to functions that accept label XML as a parameter, or can be used to direct content
  		 * manipulations not currently supported by the Framework.
  		 */
  def getLabelXml(): java.lang.String
  /**
  		 * Gets an array of object reference names on the label. Returns an array of strings.
  		 */
  def getObjectNames(): js.Array[java.lang.String]
  /**
  		 * Gets the 'text' content of an object. The content depends on the object type.
    * * Address and Text objects - Returns the object text without formatting.
    * * Barcode object - Returns the barcode string.
    * * Image - Returns the base64-encoded string on the image's PNG stream (only if image data is embedded with the label and not linked to a URL or file).
    * * Circular Text object - Returns the object text.
    * * Other objects - Returns an empty string.
  		 *
  		 * @param objectName The name of the object.
  		 */
  def getObjectText(objectName: java.lang.String): java.lang.String
  /**
  		 * Prints the label.
  		 *
    	 * @param printerName The name of the printer to print to. A list of printers can be obtained using dymo.label.framework.getPrinters.
    	 * @param printParamsXml The print parameters, such as number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}.
    	 * @param labelSetXml
  		 *   The LabelSet to print. LabelSet is used to print multiple labels with the same layout, but with different
  		 *   data, such as multiple addresses. Use the dymo.label.framework.LabelSetBuilder class to create a LabelSet
  		 *   or construct XML manually according to [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
  		 */
  def print(printerName: java.lang.String, printParamsXml: java.lang.String, labelSetXml: java.lang.String): scala.Unit
  /**
  		 * Prints a label and runs status checking in a loop
  		 *
    	 * @param printerName The name of the printer to print to. A list of printers can be obtained using dymo.label.framework.getPrinters.
    	 * @param printParamsXml The print parameters, such as number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}.
    	 * @param labelSetXml The LabelSet to print.
  		 *   LabelSet is used to print multiple labels with the same layout, but with different data, such as multiple
  		 *   addresses. Use the dymo.label.framework.LabelSetBuilder class to create a LabelSet or construct XML manually
  		 *   according to [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
  		 * @param statusCallback Status callback function called when the service returned status information.
  		 *   The callback takes two parameters; the first is PrintJob object. It can be used to get the status information on demand,
  		 *   without using polling. Also, it might be extended in the future to provide more control over the print job, e.g. an ability
  		 *   to cancel it. The second parameter to the callback is PrintJobStatusInfo class. PrintJobStatusInfo has two properties:
  		 *   statusMessage that contains a status message string; and status that contains status code. The callback has to return a
  		 *   boolean value. If true is returned, than pritnAndPollStatus() will poll the service again after the pollInterval passed.
  		 *   If false is returned, then printAndPollStatus() finishes processing.
  		 * @param pollInterval Interval in milliseconds to ask the proxy service for the job status information.
  		 *
  		 * @returns The print job.
  		 */
  def printAndPollStatus(
    printerName: java.lang.String,
    printParamsXml: java.lang.String,
    labelSetXml: java.lang.String,
    statusCallback: js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, scala.Boolean],
    pollInterval: scala.Double
  ): PrintJob
  /**
  		 * Creates a label raster image that can be used for label previewing.
    *
  		 * @param renderParamsXml Rendering parameters, such as shadow depth, label color, etc.
  		 *   See [LabelRenderParams.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelRenderParams.xsd}.
    * @param printerName The name of the printer that the preview is generated for.
  		 *   The preview/output can be different for different printers,
  		 *   especially for tape printers with different print head sizes.
  		 *   If it is not important what printer the label is printed to,
  		 *   an empty string can be passed. In this case, the default printer metrics will
  		 *   be used. The default is LW400 for LabelWriter printers and LW400 DUO Tape for
  		 *   tape printers.
  		 */
  def render(renderParamsXml: java.lang.String, printerName: java.lang.String): java.lang.String
  /**
  		 * Sets the Intelligent Mail barcode position for an Address object.
  		 *
  		 * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
  		 * @param barcodePosition The barcode position.
  		 *
  		 * @returns self
  		 */
  def setAddressBarcodePosition(addressIndex: scala.Double, barcodePosition: AddressBarcodePosition): ILabel
  /**
  		 * Sets the text content of an Address object.
  		 *
  		 * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
    	 * @param text The plain text string that contains the content of the Address object. Note: The current text formatting is retained on a line-by-line basis.
  		  *
  		  * @returns self
  		 */
  def setAddressText(addressIndex: scala.Double, text: java.lang.String): ILabel
  /**
  		 * Sets the text content for an object. The content and/or text formatting are set differently
  		 * depending on the object type.
  		 *
  		 * * Address object - The formatting is applied on a line-by-line basis (using list).
  		 * * Text object - The formatting of the current first character is applied to all text.
  		 * * Barcode object - The barcode text.
  		 * * Image object - The base64-encoded string of image's PNG stream.
  		 * * CircularText object - The object text.
  		 * * Date and Time and Counter objects - The object's 'Before' text.
  		 * * Other objects - An empty string.
  		 *
  	     * @param objectName The name of the object.
    	 * @param text The plain text string for new object content.
  		 */
  def setObjectText(objectName: java.lang.String, text: java.lang.String): ILabel
}

object ILabel {
  @scala.inline
  def apply(
    getAddressBarcodePosition: js.Function1[scala.Double, AddressBarcodePosition],
    getAddressObjectCount: js.Function0[scala.Double],
    getAddressText: js.Function1[scala.Double, java.lang.String],
    getLabelXml: js.Function0[java.lang.String],
    getObjectNames: js.Function0[js.Array[java.lang.String]],
    getObjectText: js.Function1[java.lang.String, java.lang.String],
    print: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    printAndPollStatus: js.Function5[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, scala.Boolean], 
      scala.Double, 
      PrintJob
    ],
    render: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    setAddressBarcodePosition: js.Function2[scala.Double, AddressBarcodePosition, ILabel],
    setAddressText: js.Function2[scala.Double, java.lang.String, ILabel],
    setObjectText: js.Function2[java.lang.String, java.lang.String, ILabel]
  ): ILabel = {
    val __obj = js.Dynamic.literal(getAddressBarcodePosition = getAddressBarcodePosition, getAddressObjectCount = getAddressObjectCount, getAddressText = getAddressText, getLabelXml = getLabelXml, getObjectNames = getObjectNames, getObjectText = getObjectText, print = print, printAndPollStatus = printAndPollStatus, render = render, setAddressBarcodePosition = setAddressBarcodePosition, setAddressText = setAddressText, setObjectText = setObjectText)
  
    __obj.asInstanceOf[ILabel]
  }
}

