package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to manage InkStroke handwriting recognition data. */
@JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
@js.native
abstract class InkRecognitionResult () extends js.Object {
  /** Gets the bounding rectangle of the InkStroke data used for handwriting recognition. */
  var boundingRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Retrieves all ink strokes used for handwriting recognition.
    * @return The ink strokes used for handwriting recognition as a collection of InkStroke objects.
    */
  def getStrokes(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke] = js.native
  /**
    * Retrieves the collection of strings identified as potential matches for each word returned by handwriting recognition.
    * @return The recognition matches as a collection of String objects. The most likely candidate is topmost in the collection.
    */
  def getTextCandidates(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

