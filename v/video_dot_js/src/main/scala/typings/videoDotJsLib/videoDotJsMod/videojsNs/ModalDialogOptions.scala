package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options for this class
	 *
	 * @param [content=undefined]
	 *        Provide customized content for this modal.
	 *
	 * @param [description]
	 *        A text description for the modal, primarily for accessibility.
	 *
	 * @param [fillAlways=false]
	 *        Normally, modals are automatically filled only the first time
	 *        they open. This tells the modal to refresh its content
	 *        every time it opens.
	 *
	 * @param [label]
	 *        A text label for the modal, primarily for accessibility.
	 *
	 * @param [temporary=true]
	 *        If `true`, the modal can only be opened once; it will be
	 *        disposed as soon as it's closed.
	 *
	 * @param [uncloseable=false]
	 *        If `true`, the user will not be able to close the modal
	 *        through the UI in the normal ways. Programmatic closing is
	 *        still possible.
	 */
trait ModalDialogOptions extends ComponentOptions {
  var content: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fillAlways: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var temporary: js.UndefOr[scala.Boolean] = js.undefined
  var uncloseable: js.UndefOr[scala.Boolean] = js.undefined
}

