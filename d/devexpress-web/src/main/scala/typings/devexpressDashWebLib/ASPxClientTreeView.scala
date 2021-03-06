package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTreeView object.
  */
trait ASPxClientTreeView extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTreeView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]]
  /**
    * Occurs on the client side when the node's checked state is changed by clicking on a check box.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client side after a node has been clicked.
    */
  var NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]]
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  def CollapseAll(): scala.Unit
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  def ExpandAll(): scala.Unit
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: scala.Double): ASPxClientTreeViewNode
  /**
    * Returns a node specified by its name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: java.lang.String): ASPxClientTreeViewNode
  /**
    * Returns a node specified by its text.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: java.lang.String): ASPxClientTreeViewNode
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  def GetNodeCount(): scala.Double
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  def GetRootNode(): ASPxClientTreeViewNode
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  def GetSelectedNode(): ASPxClientTreeViewNode
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: ASPxClientTreeViewNode): scala.Unit
}

object ASPxClientTreeView {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: () => scala.Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: () => scala.Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetNode: scala.Double => ASPxClientTreeViewNode,
    GetNodeByName: java.lang.String => ASPxClientTreeViewNode,
    GetNodeByText: java.lang.String => ASPxClientTreeViewNode,
    GetNodeCount: () => scala.Double,
    GetParentControl: () => js.Object,
    GetRootNode: () => ASPxClientTreeViewNode,
    GetSelectedNode: () => ASPxClientTreeViewNode,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetSelectedNode: ASPxClientTreeViewNode => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, CheckedChanged = CheckedChanged, CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback, ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootNode = js.Any.fromFunction0(GetRootNode), GetSelectedNode = js.Any.fromFunction0(GetSelectedNode), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, NodeClick = NodeClick, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedNode = js.Any.fromFunction1(SetSelectedNode), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientTreeView]
  }
}

