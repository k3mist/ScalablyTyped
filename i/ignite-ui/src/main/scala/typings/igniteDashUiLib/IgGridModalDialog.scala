package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridModalDialog
  extends /**
	 * Option for igGridModalDialog
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var buttonApplyDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired when the button Cancel is clicked
  	 */
  var buttonCancelClick: js.UndefOr[ButtonCancelClickEvent] = js.undefined
  /**
  	 * Event fired when the button OK/Apply is clicked
  	 */
  var buttonOKClick: js.UndefOr[ButtonOKClickEvent] = js.undefined
  /**
  	 * If true and Enter is pressed - close modal dialog(NOTE: buttonApplyDisabled should be set to false - otherwise this options is ignored)
  	 */
  var closeModalDialogOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is closed.
  	 * The handler function takes arguments evt and ui.
  	 * Use ui.owner to get the reference to the igGridModalDialog widget.
  	 * Use ui.modalDialog to get the reference to the igGridModalDialog element
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.undefined
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.undefined
  /**
  	 * The default modal dialog height in pixels.
  	 */
  var modalDialogHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired every time the modal dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.undefined
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.undefined
  /**
  	 * The default modal dialog width in pixels.
  	 */
  var modalDialogWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var renderFooterButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Tab index to assign to containers and buttons inside the dialog
  	 */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object IgGridModalDialog {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridModalDialog
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animationDuration: scala.Int | scala.Double = null,
    buttonApplyDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    buttonCancelClick: ButtonCancelClickEvent = null,
    buttonOKClick: ButtonOKClickEvent = null,
    closeModalDialogOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    locale: js.Any = null,
    modalDialogClosed: ModalDialogClosedEvent = null,
    modalDialogClosing: ModalDialogClosingEvent = null,
    modalDialogContentsRendered: ModalDialogContentsRenderedEvent = null,
    modalDialogContentsRendering: ModalDialogContentsRenderingEvent = null,
    modalDialogHeight: scala.Int | scala.Double = null,
    modalDialogMoving: ModalDialogMovingEvent = null,
    modalDialogOpened: ModalDialogOpenedEvent = null,
    modalDialogOpening: ModalDialogOpeningEvent = null,
    modalDialogWidth: scala.Int | scala.Double = null,
    regional: java.lang.String | js.Object = null,
    renderFooterButtons: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null
  ): IgGridModalDialog = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonApplyDisabled)) __obj.updateDynamic("buttonApplyDisabled")(buttonApplyDisabled)
    if (buttonCancelClick != null) __obj.updateDynamic("buttonCancelClick")(buttonCancelClick)
    if (buttonOKClick != null) __obj.updateDynamic("buttonOKClick")(buttonOKClick)
    if (!js.isUndefined(closeModalDialogOnEnter)) __obj.updateDynamic("closeModalDialogOnEnter")(closeModalDialogOnEnter)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (modalDialogClosed != null) __obj.updateDynamic("modalDialogClosed")(modalDialogClosed)
    if (modalDialogClosing != null) __obj.updateDynamic("modalDialogClosing")(modalDialogClosing)
    if (modalDialogContentsRendered != null) __obj.updateDynamic("modalDialogContentsRendered")(modalDialogContentsRendered)
    if (modalDialogContentsRendering != null) __obj.updateDynamic("modalDialogContentsRendering")(modalDialogContentsRendering)
    if (modalDialogHeight != null) __obj.updateDynamic("modalDialogHeight")(modalDialogHeight.asInstanceOf[js.Any])
    if (modalDialogMoving != null) __obj.updateDynamic("modalDialogMoving")(modalDialogMoving)
    if (modalDialogOpened != null) __obj.updateDynamic("modalDialogOpened")(modalDialogOpened)
    if (modalDialogOpening != null) __obj.updateDynamic("modalDialogOpening")(modalDialogOpening)
    if (modalDialogWidth != null) __obj.updateDynamic("modalDialogWidth")(modalDialogWidth.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFooterButtons)) __obj.updateDynamic("renderFooterButtons")(renderFooterButtons)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridModalDialog]
  }
}

