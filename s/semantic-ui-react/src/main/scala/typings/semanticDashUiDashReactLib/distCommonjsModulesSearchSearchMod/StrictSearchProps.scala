package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchProps extends js.Object {
  // ------------------------------------
  // Style
  // ------------------------------------
  /** A search can have its results aligned to its left or right container edge. */
  var aligned: js.UndefOr[java.lang.String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A search can display results from remote content ordered by categories. */
  var category: js.UndefOr[scala.Boolean] = js.undefined
  // ------------------------------------
  // Rendering
  // ------------------------------------
  /**
    * Renders the SearchCategory contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable SearchCategory contents.
    */
  var categoryRenderer: js.UndefOr[
    js.Function1[
      /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  // ------------------------------------
  // Behavior
  // ------------------------------------
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Initial value. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** A search can have its results take up the width of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** A search input can take up the width of its container. */
  var input: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps]
  ] = js.undefined
  /** A search can show a loading indicator. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** Minimum characters to query for results. */
  var minCharacters: js.UndefOr[scala.Double] = js.undefined
  /** Additional text for "No Results" message with less emphasis. */
  var noResultsDescription: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  // ------------------------------------
  // Callbacks
  // ------------------------------------
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when a result is selected.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onResultSelect: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultData, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of search input.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the active selection index is changed.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onSelectionChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultData, 
      scala.Unit
    ]
  ] = js.undefined
  /** Controls whether or not the results menu is displayed. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Renders the SearchResult contents.
    *
    * @param {object} props - The SearchResult props object.
    * @returns {*} - Renderable SearchResult contents.
    */
  var resultRenderer: js.UndefOr[
    js.Function1[
      /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
    * One of:
    * - array of Search.Result props e.g. `{ title: '', description: '' }` or
    * - object of categories e.g. `{ name: '', results: [{ title: '', description: '' }]`
    */
  var results: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  /** Whether the search should automatically select the first result after searching. */
  var selectFirstResult: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether a "no results" message should be shown if no results are found. */
  var showNoResults: js.UndefOr[scala.Boolean] = js.undefined
  /** A search can have different sizes. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive
  ] = js.undefined
  /** Current value of the search input. Creates a controlled component. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object StrictSearchProps {
  @scala.inline
  def apply(
    aligned: java.lang.String = null,
    as: js.Any = null,
    category: js.UndefOr[scala.Boolean] = js.undefined,
    categoryRenderer: /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps => reactLib.reactMod.ReactNs.ReactElement[_] = null,
    className: java.lang.String = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any = null,
    input: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps] = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    minCharacters: scala.Int | scala.Double = null,
    noResultsDescription: reactLib.reactMod.ReactNs.ReactNode = null,
    noResultsMessage: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onFocus: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onMouseDown: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onResultSelect: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], /* data */ SearchResultData) => scala.Unit = null,
    onSearchChange: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchProps) => scala.Unit = null,
    onSelectionChange: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SearchResultData) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    resultRenderer: /* props */ semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps => reactLib.reactMod.ReactNs.ReactElement[_] = null,
    results: js.Array[_] | js.Object = null,
    selectFirstResult: js.UndefOr[scala.Boolean] = js.undefined,
    showNoResults: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null,
    value: java.lang.String = null
  ): StrictSearchProps = {
    val __obj = js.Dynamic.literal()
    if (aligned != null) __obj.updateDynamic("aligned")(aligned)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category)
    if (categoryRenderer != null) __obj.updateDynamic("categoryRenderer")(js.Any.fromFunction1(categoryRenderer))
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (minCharacters != null) __obj.updateDynamic("minCharacters")(minCharacters.asInstanceOf[js.Any])
    if (noResultsDescription != null) __obj.updateDynamic("noResultsDescription")(noResultsDescription.asInstanceOf[js.Any])
    if (noResultsMessage != null) __obj.updateDynamic("noResultsMessage")(noResultsMessage.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onResultSelect != null) __obj.updateDynamic("onResultSelect")(js.Any.fromFunction2(onResultSelect))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2(onSelectionChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (resultRenderer != null) __obj.updateDynamic("resultRenderer")(js.Any.fromFunction1(resultRenderer))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult)
    if (!js.isUndefined(showNoResults)) __obj.updateDynamic("showNoResults")(showNoResults)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StrictSearchProps]
  }
}

