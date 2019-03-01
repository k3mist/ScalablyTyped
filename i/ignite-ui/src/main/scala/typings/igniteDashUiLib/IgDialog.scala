package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDialog
  extends /**
	 * Option for igDialog
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Event which is raised after the end of the animation when the dialog was closed or opened.
  	 */
  var animationEnded: js.UndefOr[AnimationEndedEvent] = js.undefined
  /**
  	 * Event which is raised when the dialog or its content loses focus.
  	 */
  var blur: js.UndefOr[BlurEvent] = js.undefined
  /**
  	 * Gets/Sets the animation applied to the dialog when it is closed. That can be any object supported by the jquery hide(param) method.
  	 *
  	 */
  var closeAnimation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the close button in the dialog. Use option [locale.closeButtonTitle](ui.igdialog#options:locale.closeButtonTitle).
  	 */
  var closeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether the dialog should close when Esc key is pressed.
  	 *
  	 */
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the container html element for the dialog.
  	 * That can be reference to html element, jquery selector or jquery object.
  	 * By default the parent form of the original target element is used. If a form is not found, then the body is used.
  	 * Note: If the "position" of the container is not set or it is "static", then the position is set to "relative".
  	 *
  	 */
  var container: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the css class which is applied to the main DIV element of the dialog.
  	 *
  	 */
  var dialogClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether the dialog can be dragged by the user.
  	 *
  	 */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the processing of the double-click on the dialog-header.If this option is not false and dialog was minimized, then its state will be set to normal.
  	 * If this option is set to "auto" and showMaximizeButton is enabled or if this option is set to true, then the dialog will be maximized when it was in normal state,
  	 * and dialog-state will be set to normal if it was maximized.
  	 *
  	 */
  var enableDblclick: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the ability to adjust the state of the header depending on focused and not-focused states. Note: the "trackFocus" option should be enabled.
  	 *
  	 */
  var enableHeaderFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event which is raised when the dialog or its content gets focus.
  	 */
  var focus: js.UndefOr[IgFocusEvent] = js.undefined
  /**
  	 * Gets/Sets the text which appears in the footer of the dialog.
  	 *
  	 */
  var footerText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the text which appears in the header of the dialog.
  	 *
  	 */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the initial height of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
  	 * In case of "%", the size of browser window is used and it has effect only on open action.
  	 *
  	 */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Gets the name of the css class which is applied to the SPAN element located on the left side of the header.
  	 *
  	 */
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgDialogLocale] = js.undefined
  /**
  	 * Gets the jquery DIV object which is used as the main container for the dialog.
  	 * Notes:
  	 * 1. That object is optional and it should not contain any children.
  	 * 2. It should not have parent.
  	 * 3. It should not contain attributes which might destroy layout or appearance of the dialog.
  	 * 4. Change of that option is not supported.
  	 *
  	 */
  var mainElement: js.UndefOr[stdLib.Element] = js.undefined
  /**
  	 * Gets/Sets the maximal height of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
  	 *
  	 */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the maximal width of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
  	 *
  	 */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the maximize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
  	 */
  var maximizeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the minimal height of the dialog in normal state.
  	 *
  	 */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the minimal width of the dialog in normal state.
  	 *
  	 */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the minimize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
  	 */
  var minimizeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the modal state of the dialog.
  	 * If there are more than 1 modal igDialog, then the last opened dialog wins and becomes on the top.
  	 * Note: the modal functionality is not supported when the dialog is minimized or pinned, because that will trigger misbehavior.
  	 *
  	 */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the animation applied to the dialog when it is opened. That can be any object supported by the jquery show(param) method.
  	 *
  	 */
  var openAnimation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the pin button in the dialog. Use option [locale.pinButtonTitle](ui.igdialog#options:locale.pinButtonTitle).
  	 */
  var pinButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether the dialog will be pinned on minimize.
  	 *
  	 */
  var pinOnMinimized: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the dialog is pinned.
  	 * When the dialog is pinned, then the html element of the dialog is moved to the original container where the target element was located and position:absolute is removed.
  	 * The pinned dialog does not support modal state, maximized state and it can not be moved.
  	 * Notes:
  	 * 1. If the parent element of the original target-element is invisible, then the pinned dialog becomes invisible as well.
  	 * 2. Pinned state is not supported for modal dialog.
  	 *
  	 */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the initial position of the dialog. That should be an object, which contains "top" and "left" members or an object
  	 * supported by jquery.position(param) method. Examples: { left: 100, top: 200 }, { my: "left top", at: "left top", offset: "100 200" }
  	 *
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Gets/Sets whether the dialog can be resized by the user.
  	 *
  	 */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the restore button in the dialog.  Use option [locale.restoreButtonTitle](ui.igdialog#options:locale.restoreButtonTitle).
  	 */
  var restoreButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether the close button in the dialog header should be visible.
  	 *
  	 */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the dialog footer should be visible.
  	 *
  	 */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the dialog header should be visible.
  	 *
  	 */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the maximize button in the dialog header should be visible.
  	 *
  	 */
  var showMaximizeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the minimize button in the dialog header should be visible.
  	 *
  	 */
  var showMinimizeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the pin button in the dialog header should be visible.
  	 *
  	 */
  var showPinButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the state of the dialog.Note: when the dialog is modal, then pinned and minimized states are not supported, because that will trigger misbehavior.
  	 *
  	 *
  	 * Valid values:
  	 * "opened" The dialog is opened.
  	 * "minimized" The dialog is minimized.
  	 * "maximized" The dialog is maximized.
  	 * "closed" The dialog is closed.
  	 */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event which is raised after the state of the dialog was changed.
  	 */
  var stateChanged: js.UndefOr[StateChangedEvent] = js.undefined
  /**
  	 * Event which is raised before the state of the dialog was changed.
  	 * Return false in order to cancel the action.
  	 */
  var stateChanging: js.UndefOr[StateChangingEvent] = js.undefined
  /**
  	 * Gets/Sets the value for the tabIndex attribute applied to the main html element of the dialog.
  	 *
  	 */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the temporary value for src, which is used while changing the parent of the base element if it is an instance of IFRAME. That allows getting around possible JavaScript exceptions under IE.
  	 *
  	 */
  var temporaryUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the ability to process focus and blur events of the child elements located in the dialog in order to maintain the focused state.
  	 * Notes:
  	 * If that option is enabled, then focus and blur event handlers are added to all the child elements of the dialog.
  	 * If the dialog is modal or it can be maximized, then it is not recommended to disable that option.
  	 * If that option is modified after the igDialog was already created, then depending on current state of the dialog, it will be temporary closed-opened or opened-closed.
  	 *
  	 */
  var trackFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the unpin button in the dialog. Use option [locale.unpinButtonTitle](ui.igdialog#options:locale.unpinButtonTitle).
  	 */
  var unpinButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the initial width of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
  	 * In case of "%", the size of browser window is used and it has effect only on open action.
  	 *
  	 */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the value of zIndex applied to the main html element of the dialog. If value is not set, then 1000 is used.
  	 *
  	 */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IgDialog {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igDialog
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animationEnded: AnimationEndedEvent = null,
    blur: BlurEvent = null,
    closeAnimation: js.Any = null,
    closeButtonTitle: java.lang.String = null,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    container: js.Any = null,
    dialogClass: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    enableDblclick: js.Any = null,
    enableHeaderFocus: js.UndefOr[scala.Boolean] = js.undefined,
    focus: IgFocusEvent = null,
    footerText: java.lang.String = null,
    headerText: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    imageClass: java.lang.String = null,
    language: java.lang.String = null,
    locale: IgDialogLocale = null,
    mainElement: stdLib.Element = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    maximizeButtonTitle: java.lang.String = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    minimizeButtonTitle: java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    openAnimation: js.Any = null,
    pinButtonTitle: java.lang.String = null,
    pinOnMinimized: js.UndefOr[scala.Boolean] = js.undefined,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.Any = null,
    regional: java.lang.String | js.Object = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    restoreButtonTitle: java.lang.String = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showMaximizeButton: js.UndefOr[scala.Boolean] = js.undefined,
    showMinimizeButton: js.UndefOr[scala.Boolean] = js.undefined,
    showPinButton: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null,
    stateChanged: StateChangedEvent = null,
    stateChanging: StateChangingEvent = null,
    tabIndex: scala.Int | scala.Double = null,
    temporaryUrl: java.lang.String = null,
    trackFocus: js.UndefOr[scala.Boolean] = js.undefined,
    unpinButtonTitle: java.lang.String = null,
    width: scala.Double | java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): IgDialog = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationEnded != null) __obj.updateDynamic("animationEnded")(animationEnded)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (closeAnimation != null) __obj.updateDynamic("closeAnimation")(closeAnimation)
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (container != null) __obj.updateDynamic("container")(container)
    if (dialogClass != null) __obj.updateDynamic("dialogClass")(dialogClass)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (enableDblclick != null) __obj.updateDynamic("enableDblclick")(enableDblclick)
    if (!js.isUndefined(enableHeaderFocus)) __obj.updateDynamic("enableHeaderFocus")(enableHeaderFocus)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (footerText != null) __obj.updateDynamic("footerText")(footerText)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mainElement != null) __obj.updateDynamic("mainElement")(mainElement)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (maximizeButtonTitle != null) __obj.updateDynamic("maximizeButtonTitle")(maximizeButtonTitle)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minimizeButtonTitle != null) __obj.updateDynamic("minimizeButtonTitle")(minimizeButtonTitle)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation)
    if (pinButtonTitle != null) __obj.updateDynamic("pinButtonTitle")(pinButtonTitle)
    if (!js.isUndefined(pinOnMinimized)) __obj.updateDynamic("pinOnMinimized")(pinOnMinimized)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (position != null) __obj.updateDynamic("position")(position)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (restoreButtonTitle != null) __obj.updateDynamic("restoreButtonTitle")(restoreButtonTitle)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showMaximizeButton)) __obj.updateDynamic("showMaximizeButton")(showMaximizeButton)
    if (!js.isUndefined(showMinimizeButton)) __obj.updateDynamic("showMinimizeButton")(showMinimizeButton)
    if (!js.isUndefined(showPinButton)) __obj.updateDynamic("showPinButton")(showPinButton)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateChanged != null) __obj.updateDynamic("stateChanged")(stateChanged)
    if (stateChanging != null) __obj.updateDynamic("stateChanging")(stateChanging)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (temporaryUrl != null) __obj.updateDynamic("temporaryUrl")(temporaryUrl)
    if (!js.isUndefined(trackFocus)) __obj.updateDynamic("trackFocus")(trackFocus)
    if (unpinButtonTitle != null) __obj.updateDynamic("unpinButtonTitle")(unpinButtonTitle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDialog]
  }
}

