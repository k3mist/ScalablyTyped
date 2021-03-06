package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to a control that displays a set of hierarchical data as an outline.
  * @see TreeControl
  */
trait XTreeControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XMultiSelectionSupplier {
  /**
    * If the given URL points to a loadable graphic, the graphic is rendered before collapsed non leaf nodes.
    *
    * This can be overridden for individual nodes by {@link XTreeNode.getCollapsedGraphicURL()}
    */
  var DefaultCollapsedGraphicURL: java.lang.String
  /**
    * If the given URL points to a loadable graphic, the graphic is rendered before expanded non leaf nodes.
    *
    * This can be overridden for individual nodes by {@link XTreeNode.getExpandedGraphicURL()}
    */
  var DefaultExpandedGraphicURL: java.lang.String
  /**
    * Adds a {@link XTreeEditListener} .
    * @param Listener a {@link XTreeEditListener} that will be notified before and after a tree node is edited.
    */
  def addTreeEditListener(Listener: XTreeEditListener): scala.Unit
  /**
    * Adds a listener for TreeExpansion events.
    * @param Listener a {@link XTreeExpansionListener} that will be notified when a tree node is expanded or collapsed.
    */
  def addTreeExpansionListener(Listener: XTreeExpansionListener): scala.Unit
  /**
    * Cancels the current editing session.
    *
    * Has no effect if the tree isn't being edited.
    */
  def cancelEditing(): scala.Unit
  /**
    * Ensures that **Node** is collapsed.
    * @param Node the {@link XTreeNode} identifying a node
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws ExpandVetoException if collapsing **Node** failed because at least one of the registered {@link XTreeExpansionListener} raised a {@link ExpandVet
    */
  def collapseNode(Node: XTreeNode): scala.Unit
  /**
    * Ensures that **Node** is expanded and visible.
    *
    * If **Node** is a leaf node, this will have no effect.
    * @param Node the {@link XTreeNode} identifying a node.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws ExpandVetoException if expanding **Node** failed because at least one of the registered {@link XTreeExpansionListener} raised a {@link ExpandVeto
    */
  def expandNode(Node: XTreeNode): scala.Unit
  /**
    * Returns the node that is closest to x,y.
    *
    * If no nodes are currently viewable, or there is no model, returns null, otherwise it always returns a valid node. To test if the node is exactly at x,
    * y, use {@link getNodeForLocation()} .
    * @param x an integer giving the number of pixels horizontally from the left edge of the controls display area
    * @param y an integer giving the number of pixels vertically from the top edge of the controls display area
    * @returns the {@link XTreeNode} for the node closest to that location, null if nothing is viewable or there is no model
    */
  def getClosestNodeForLocation(x: scala.Double, y: scala.Double): XTreeNode
  /**
    * Returns the node at the specified location.
    * @param x an integer giving the number of pixels horizontally from the left edge of the controls display area
    * @param y an integer giving the number of pixels vertically from the top edge of the controls display area
    * @returns the {@link XTreeNode} for the node at that location, or 0 if there is no node at the given position
    */
  def getNodeForLocation(x: scala.Double, y: scala.Double): XTreeNode
  /**
    * returns the rectangle occupied by the visual representation of the given node
    * @param Node the node whose geometry should be obtained
    * @throws com::sun::star::lang::IllegalArgumentException if the given node is `NULL` , or does not belong to the tree's data model
    */
  def getNodeRect(Node: XTreeNode): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Returns `TRUE` if one of tree's nodes is being currently edited.
    *
    * The node that is being edited can be obtained using {@link com.sun.star.view.XSelectionSupplier.getSelection()} .
    * @returns `TRUE` if the user is currently editing a node
    */
  def isEditing(): scala.Boolean
  /**
    * Returns `TRUE` if **Node** is currently collapsed.
    * @param Node the {@link XTreeNode} specifying the node to check
    * @returns `TRUE` if **Node** or at least one of its parent nodes are collapsed, `FALSE` if **Node** and all of its parent nodes are expanded
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def isNodeCollapsed(Node: XTreeNode): scala.Boolean
  /**
    * Returns `TRUE` if **Node** is currently expanded.
    * @param Node the {@link XTreeNode} specifying the node to check.
    * @returns `FALSE` if **Node** or at least one of its parent nodes are collapsed, `TRUE` if **Node** and all of its parent nodes are expanded.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def isNodeExpanded(Node: XTreeNode): scala.Boolean
  /**
    * Returns `TRUE` if **Node** is currently visible.
    *
    * Visible means it is either the root or all of its parents are expanded.
    * @returns `TRUE` if **Node** is visible, otherwise `FALSE`
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def isNodeVisible(Node: XTreeNode): scala.Boolean
  /**
    * Ensures that **Node** is currently visible.
    *
    * This includes expanding all parent nodes and scroll the control so this node is visible in the controls display area.
    * @param Node the {@link XTreeNode} specifying the node to make visible.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws ExpandVetoException if **Node** can't be made visible since at least one of the parent nodes are collapsed and expanding failed because at least
    */
  def makeNodeVisible(Node: XTreeNode): scala.Unit
  /**
    * Removes a {@link XTreeEditListener} .
    * @param Listener the {@link XTreeEditListener} to remove
    */
  def removeTreeEditListener(Listener: XTreeEditListener): scala.Unit
  /**
    * Removes a listener for TreeExpansion events.
    * @param Listener the {@link XTreeExpansionListener} to remove.
    */
  def removeTreeExpansionListener(Listener: XTreeExpansionListener): scala.Unit
  /**
    * Selects **Node** and initiates editing.
    *
    * If {@link TreeControlModel.Editable} is `FALSE` or if there are no registered {@link XTreeEditListener} , this call has no effect.
    *
    * Calling this method also ensures that **Node** will become visible.
    * @param Node the {@link XTreeNode} identifying a node.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def startEditingAtNode(Node: XTreeNode): scala.Unit
  /**
    * Ends the current editing session.
    *
    * All registered {@link XTreeEditListener} are notified if an editing session was in progress
    *
    * Has no effect if the tree isn't being edited.
    * @returns `TRUE` if editing was in progress and is now stopped, `FALSE` if editing was not in progress
    */
  def stopEditing(): scala.Boolean
}

object XTreeControl {
  @scala.inline
  def apply(
    DefaultCollapsedGraphicURL: java.lang.String,
    DefaultExpandedGraphicURL: java.lang.String,
    Selection: js.Any,
    SelectionCount: scala.Double,
    acquire: () => scala.Unit,
    addSelection: js.Any => scala.Boolean,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    addTreeEditListener: XTreeEditListener => scala.Unit,
    addTreeExpansionListener: XTreeExpansionListener => scala.Unit,
    cancelEditing: () => scala.Unit,
    clearSelection: () => scala.Unit,
    collapseNode: XTreeNode => scala.Unit,
    createReverseSelectionEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    createSelectionEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    expandNode: XTreeNode => scala.Unit,
    getClosestNodeForLocation: (scala.Double, scala.Double) => XTreeNode,
    getNodeForLocation: (scala.Double, scala.Double) => XTreeNode,
    getNodeRect: XTreeNode => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getSelection: () => js.Any,
    getSelectionCount: () => scala.Double,
    isEditing: () => scala.Boolean,
    isNodeCollapsed: XTreeNode => scala.Boolean,
    isNodeExpanded: XTreeNode => scala.Boolean,
    isNodeVisible: XTreeNode => scala.Boolean,
    makeNodeVisible: XTreeNode => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSelection: js.Any => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    removeTreeEditListener: XTreeEditListener => scala.Unit,
    removeTreeExpansionListener: XTreeExpansionListener => scala.Unit,
    select: js.Any => scala.Boolean,
    startEditingAtNode: XTreeNode => scala.Unit,
    stopEditing: () => scala.Boolean
  ): XTreeControl = {
    val __obj = js.Dynamic.literal(DefaultCollapsedGraphicURL = DefaultCollapsedGraphicURL, DefaultExpandedGraphicURL = DefaultExpandedGraphicURL, Selection = Selection, SelectionCount = SelectionCount, acquire = js.Any.fromFunction0(acquire), addSelection = js.Any.fromFunction1(addSelection), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addTreeEditListener = js.Any.fromFunction1(addTreeEditListener), addTreeExpansionListener = js.Any.fromFunction1(addTreeExpansionListener), cancelEditing = js.Any.fromFunction0(cancelEditing), clearSelection = js.Any.fromFunction0(clearSelection), collapseNode = js.Any.fromFunction1(collapseNode), createReverseSelectionEnumeration = js.Any.fromFunction0(createReverseSelectionEnumeration), createSelectionEnumeration = js.Any.fromFunction0(createSelectionEnumeration), expandNode = js.Any.fromFunction1(expandNode), getClosestNodeForLocation = js.Any.fromFunction2(getClosestNodeForLocation), getNodeForLocation = js.Any.fromFunction2(getNodeForLocation), getNodeRect = js.Any.fromFunction1(getNodeRect), getSelection = js.Any.fromFunction0(getSelection), getSelectionCount = js.Any.fromFunction0(getSelectionCount), isEditing = js.Any.fromFunction0(isEditing), isNodeCollapsed = js.Any.fromFunction1(isNodeCollapsed), isNodeExpanded = js.Any.fromFunction1(isNodeExpanded), isNodeVisible = js.Any.fromFunction1(isNodeVisible), makeNodeVisible = js.Any.fromFunction1(makeNodeVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelection = js.Any.fromFunction1(removeSelection), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeTreeEditListener = js.Any.fromFunction1(removeTreeEditListener), removeTreeExpansionListener = js.Any.fromFunction1(removeTreeExpansionListener), select = js.Any.fromFunction1(select), startEditingAtNode = js.Any.fromFunction1(startEditingAtNode), stopEditing = js.Any.fromFunction0(stopEditing))
  
    __obj.asInstanceOf[XTreeControl]
  }
}

