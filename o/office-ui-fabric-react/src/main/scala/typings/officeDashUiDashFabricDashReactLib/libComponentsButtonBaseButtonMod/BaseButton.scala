package typings
package officeDashUiDashFabricDashReactLib.libComponentsButtonBaseButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Button/BaseButton", "BaseButton")
@js.native
class BaseButton protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[IBaseButtonProps, IBaseButtonState]
     with officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton {
  def this(props: IBaseButtonProps, rootClassName: java.lang.String) = this()
  var _ariaDescriptionId: js.Any = js.native
  var _buttonElement: js.Any = js.native
  var _classNames: js.Any = js.native
  var _descriptionId: js.Any = js.native
  var _dismissMenu: js.Any = js.native
  val _isExpanded: js.Any = js.native
  val _isSplitButton: js.Any = js.native
  var _labelId: js.Any = js.native
  var _lastTouchTimeoutId: js.Any = js.native
  var _onClick: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyPress: js.Any = js.native
  var _onKeyUp: js.Any = js.native
  var _onMenuClick: js.Any = js.native
  var _onMenuKeyDown: js.Any = js.native
  var _onMouseDown: js.Any = js.native
  var _onMouseUp: js.Any = js.native
  var _onRenderAriaDescription: js.Any = js.native
  var _onRenderChildren: js.Any = js.native
  var _onRenderDescription: js.Any = js.native
  var _onRenderIcon: js.Any = js.native
  var _onRenderMenu: js.Any = js.native
  var _onRenderMenuIcon: js.Any = js.native
  var _onRenderText: js.Any = js.native
  var _onRenderTextContents: js.Any = js.native
  var _onSplitButtonContainerKeyDown: js.Any = js.native
  var _onSplitButtonPrimaryClick: js.Any = js.native
  var _onSplitContainerFocusCapture: js.Any = js.native
  var _onToggleMenu: js.Any = js.native
  var _onTouchStart: js.Any = js.native
  var _openMenu: js.Any = js.native
  var _processingTouch: js.Any = js.native
  var _splitButtonContainer: js.Any = js.native
  /* private */ def _handleTouchAndPointerEvent(): js.Any = js.native
  /* private */ def _hasText(): js.Any = js.native
  /* private */ def _isMenuExpanded(): js.Any = js.native
  /**
    * Returns if the user hits a valid keyboard key to open the menu
    * @param ev - the keyboard event
    * @returns True if user clicks on custom trigger key if enabled or alt + down arrow if not. False otherwise.
    */
  /* private */ def _isValidMenuOpenKey(ev: js.Any): js.Any = js.native
  /* private */ def _onPointerDown(ev: js.Any): js.Any = js.native
  /* private */ def _onRenderContent(tag: js.Any, buttonProps: js.Any): js.Any = js.native
  /* private */ def _onRenderSplitButtonContent(tag: js.Any, buttonProps: js.Any): js.Any = js.native
  /* private */ def _onRenderSplitButtonDivider(classNames: js.Any): js.Any = js.native
  /* private */ def _onRenderSplitButtonMenuButton(classNames: js.Any, keytipAttributes: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseButton(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBaseButton(prevProps: IBaseButtonProps, prevState: IBaseButtonState): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Button/BaseButton", "BaseButton")
@js.native
object BaseButton extends js.Object {
  var defaultProps: stdLib.Partial[
    officeDashUiDashFabricDashReactLib.libComponentsButtonBaseButtonMod.IBaseButtonProps
  ] = js.native
}

