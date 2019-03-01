package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
trait ASPxClientNavBar extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]]
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]]
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]]
  /**
    * Fires when a group header is clicked.
    */
  var HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]]
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]]
  /**
    * Collapses all groups of the navbar.
    */
  def CollapseAll(): scala.Unit
  /**
    * Expands all groups of the navbar.
    */
  def ExpandAll(): scala.Unit
  /**
    * Returns the navbar's active group.
    */
  def GetActiveGroup(): ASPxClientNavBarGroup
  /**
    * Returns a group specified by its index.
    * @param index An integer value specifying the zero-based index of the group object to retrieve.
    */
  def GetGroup(index: scala.Double): ASPxClientNavBarGroup
  /**
    * Returns a group specified by its name.
    * @param name A string value specifying the name of the group.
    */
  def GetGroupByName(name: java.lang.String): ASPxClientNavBarGroup
  /**
    * Returns the number of groups in the navbar.
    */
  def GetGroupCount(): scala.Double
  /**
    * Returns an item specified by its name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: java.lang.String): ASPxClientNavBarItem
  /**
    * Returns the selected item within the navbar control.
    */
  def GetSelectedItem(): ASPxClientNavBarItem
  /**
    * Makes the specified group active.
    * @param group A ASPxClientNavBarGroup object that specifies the active group.
    */
  def SetActiveGroup(group: ASPxClientNavBarGroup): scala.Unit
  /**
    * Selects the specified item within the navbar control on the client side.
    * @param item An ASPxClientNavBarItem object specifying the item to select.
    */
  def SetSelectedItem(item: ASPxClientNavBarItem): scala.Unit
}

object ASPxClientNavBar {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]],
    CollapseAll: js.Function0[scala.Unit],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]],
    ExpandAll: js.Function0[scala.Unit],
    ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]],
    ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]],
    GetActiveGroup: js.Function0[ASPxClientNavBarGroup],
    GetClientVisible: js.Function0[scala.Boolean],
    GetGroup: js.Function1[scala.Double, ASPxClientNavBarGroup],
    GetGroupByName: js.Function1[java.lang.String, ASPxClientNavBarGroup],
    GetGroupCount: js.Function0[scala.Double],
    GetHeight: js.Function0[scala.Double],
    GetItemByName: js.Function1[java.lang.String, ASPxClientNavBarItem],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetSelectedItem: js.Function0[ASPxClientNavBarItem],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetActiveGroup: js.Function1[ASPxClientNavBarGroup, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientNavBarItem, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, CollapseAll = CollapseAll, EndCallback = EndCallback, ExpandAll = ExpandAll, ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetActiveGroup = GetActiveGroup, GetClientVisible = GetClientVisible, GetGroup = GetGroup, GetGroupByName = GetGroupByName, GetGroupCount = GetGroupCount, GetHeight = GetHeight, GetItemByName = GetItemByName, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetSelectedItem = GetSelectedItem, GetVisible = GetVisible, GetWidth = GetWidth, HeaderClick = HeaderClick, InCallback = InCallback, Init = Init, ItemClick = ItemClick, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetActiveGroup = SetActiveGroup, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetSelectedItem = SetSelectedItem, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientNavBar]
  }
}

