package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link BasicViewFactory} is a view factory that provides the panes used by the Draw and Impress applications.
  *
  * The factory recognizes the following URLs: `private:resource/view/ImpressView` for the regular edit view of the Impress
  * application.`private:resource/view/GraphicView` for the regular edit view of the Draw application.`private:resource/view/OutlineView` for the outline
  * view.`private:resource/view/NotesView` for the notes view.`private:resource/view/HandoutView` for the handout view.`private:resource/view/SlideSorter`
  * for the slide sorter regardless of which pane it is used in.`private:resource/view/PresentationView` for the slide
  * show.`private:resource/view/TaskPane` for the task pane.
  */
trait BasicViewFactory extends XResourceFactory {
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController): scala.Unit
}

object BasicViewFactory {
  @scala.inline
  def apply(
    create: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    createResource: js.Function1[XResourceId, XResource],
    releaseResource: js.Function1[XResource, scala.Unit]
  ): BasicViewFactory = {
    val __obj = js.Dynamic.literal(create = create, createResource = createResource, releaseResource = releaseResource)
  
    __obj.asInstanceOf[BasicViewFactory]
  }
}

