package typings
package atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeNodeProps[T] extends ITreeNode[T] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var contentRef: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* element */ reactLib.HTMLDivElement | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  var depth: scala.Double
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onCollapse: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLSpanElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLSpanElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var path: js.Array[scala.Double]
}

object ITreeNodeProps {
  @scala.inline
  def apply[T](
    depth: scala.Double,
    id: java.lang.String | scala.Double,
    label: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    path: js.Array[scala.Double],
    childNodes: js.Array[ITreeNode[T]] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    contentRef: js.Function2[
      /* node */ TreeNode[T], 
      /* element */ reactLib.HTMLDivElement | scala.Null, 
      scala.Unit
    ] = null,
    hasCaret: js.UndefOr[scala.Boolean] = js.undefined,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | scala.Double = null,
    nodeData: T = null,
    onClick: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onCollapse: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLSpanElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onContextMenu: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDoubleClick: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onExpand: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLSpanElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function2[
      /* node */ TreeNode[T], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    secondaryLabel: java.lang.String | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null
  ): ITreeNodeProps[T] = {
    val __obj = js.Dynamic.literal(depth = depth, id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path)
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentRef != null) __obj.updateDynamic("contentRef")(contentRef)
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(onCollapse)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onExpand != null) __obj.updateDynamic("onExpand")(onExpand)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNodeProps[T]]
  }
}

