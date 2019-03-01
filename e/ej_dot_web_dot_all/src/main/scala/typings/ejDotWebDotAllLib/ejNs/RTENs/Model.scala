package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Enables/disables the editing of the content.
    * @Default {True}
    */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** RTE control can be accessed through the keyboard shortcut keys.
    * @Default {True}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** When the property is set to true, it focuses the RTE at the time of rendering.
    * @Default {false}
    */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Based on the content size, its height is adjusted instead of adding the scrollbar.
    * @Default {false}
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Sets the colorCode to display the color of the fontColor and backgroundColor in the font tools of the RTE.
    * @Default {[000000, FFFFFF, C4C4C4, ADADAD, 595959, 262626, 4f81bd, dbe5f1, b8cce4, 95b3d7, 366092, 244061, c0504d, f2dcdb, e5b9b7, d99694, 953734,632423, 9bbb59, ebf1dd, d7e3bc,
    * c3d69b, 76923c, 4f6128, 8064a2, e5e0ec, ccc1d9, b2a2c7, 5f497a, 3f3151, f79646, fdeada, fbd5b5, fac08f,e36c09, 974806]}
    */
  var colorCode: js.UndefOr[js.Any] = js.undefined
  /** The number of columns given are rendered in the color palate popup.
    * @Default {6}
    */
  var colorPaletteColumns: js.UndefOr[scala.Double] = js.undefined
  /** The number of rows given are rendered in the color palate popup.
    * @Default {6}
    */
  var colorPaletteRows: js.UndefOr[scala.Double] = js.undefined
  /** Fires when mouse click on menu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when the RTE is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root class for the RTE theme. This cssClass API helps the usage of custom skinning option for the RTE control by including this root class in CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires before the RTE is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** When the property is set to true, it returns the encrypted text.
    * @Default {false}
    */
  var enableHtmlEncode: js.UndefOr[scala.Boolean] = js.undefined
  /** Maintain the values of the RTE after page reload.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the RTE in the RTL direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the resize icon and enables the resize option in the RTE.
    * @Default {True}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the tab key action with the RichTextEditor content.
    * @Default {True}
    */
  var enableTabKeyNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Formats the contents based on the XHTML rules.
    * @Default {false}
    */
  var enableXHTML: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the RTE controlâ€™s accessibility or interaction.
    * @Default {True}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the commands are executed successfully.
    */
  var execute: js.UndefOr[js.Function1[/* e */ ExecuteEventArgs, scala.Unit]] = js.undefined
  /** This API allows to enable url and fileName for pdf export.
    * @Default {null}
    */
  var exportToPdfSettings: js.UndefOr[ExportToPdfSettings] = js.undefined
  /** This API allows to enable url and fileName for word export.
    * @Default {null}
    */
  var exportToWordSettings: js.UndefOr[ExportToWordSettings] = js.undefined
  /** Load the external CSS file inside Iframe.
    * @Default {null}
    */
  var externalCSS: js.UndefOr[java.lang.String] = js.undefined
  /** This API allows to enable the file browser support in the RTE control to browse, create, delete and upload the files in the specified current directory.
    * @Default {null}
    */
  var fileBrowser: js.UndefOr[FileBrowser] = js.undefined
  /** Sets the fontName in the RTE.
    * @Default {{text: Segoe UI, value: Segoe UI },{text: Arial, value: Arial,Helvetica,sans-serif },{text: Courier New, value: Courier New,Courier,Monospace },{text: Georgia, value:
    * Georgia,serif },{text: Impact, value: Impact,Charcoal,sans-serif },{text: Lucida Console, value: Lucida Console,Monaco,Monospace },{text: Tahoma, value: Tahoma,Geneva,sans-serif
    * },{text: Times New Roman, value: Times New Roman },{text: Trebuchet MS, value: Trebuchet MS,Helvetica,sans-serif },{text: Verdana, value: Verdana,Geneva,sans-serif}}
    */
  var fontName: js.UndefOr[js.Any] = js.undefined
  /** Sets the fontSize in the RTE.
    * @Default {{ text: 1, value: 1 },{ text: 2 (10pt), value: 2 },{ text: 3 (12pt), value: 3 },{ text: 4 (14pt), value: 4 },{ text: 5 (18pt), value: 5 },{ text: 6 (24pt), value: 6 },{
    * text: 7 (36pt), value: 7 }}
    */
  var fontSize: js.UndefOr[js.Any] = js.undefined
  /** Sets the format in the RTE.
    * @Default {{ text: Paragraph, value: &lt;p&gt;, spriteCssClass: e-paragraph },{ text: Quotation, value: &lt;blockquote&gt;, spriteCssClass: e-quotation },{ text: Heading 1, value:
    * &lt;h1&gt;, spriteCssClass: e-h1 },{ text: Heading 2, value: &lt;h2&gt;, spriteCssClass: e-h2 },{ text: Heading 3, value: &lt;h3&gt;, spriteCssClass: e-h3 },{ text: Heading 4,
    * value: &lt;h4&gt;, spriteCssClass: e-h4 },{ text: Heading 5, value: &lt;h5&gt;, spriteCssClass: e-h5 },{ text: Heading 6, value: &lt;h6&gt;, spriteCssClass: e-h6}}
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the height of the RTE textbox.
    * @Default {370}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the HTML Attributes of the ejRTE.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the given attributes to the iframe body element.
    * @Default {{}}
    */
  var iframeAttributes: js.UndefOr[js.Any] = js.undefined
  /** This API allows the image browser to support in the RTE control to browse, create, delete, and upload the image files to the specified current directory.
    * @Default {null}
    */
  var imageBrowser: js.UndefOr[ImageBrowser] = js.undefined
  /** This API allows to enable the url for connecting to RTE import.
    * @Default {null}
    */
  var importSettings: js.UndefOr[ImportSettings] = js.undefined
  /** Enables/disables responsive support for the RTE control toolbar items during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the keydown action is successful.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, scala.Unit]] = js.undefined
  /** Fires when the keyup action is successful.
    */
  var keyup: js.UndefOr[js.Function1[/* e */ KeyupEventArgs, scala.Unit]] = js.undefined
  /** Sets the culture in the RTE when you set the localization values are needs to be assigned to the corresponding text as follows.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the maximum height for the RTE outer wrapper element.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the maximum length for the RTE outer wrapper element.
    * @Default {7000}
    */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** Sets the maximum width for the RTE outer wrapper element.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the minimum height for the RTE outer wrapper element.
    * @Default {280}
    */
  var minHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the minimum width for the RTE outer wrapper element.
    * @Default {400}
    */
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the name in the RTE. When the name value is not initialized, the ID value is assigned to the name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** This API holds configuration setting for paste cleanup behavior.
    * @Default {{ listConversion: false, cleanCSS: false,	removeStyles: false, cleanElements: false }}
    */
  var pasteCleanupSettings: js.UndefOr[PasteCleanupSettings] = js.undefined
  /** Fires before the RTE Edit area is rendered and after the toolbar is rendered.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.undefined
  /** Fires when the text is selected in the text area
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Counts the total characters and displays it in the RTE footer.
    * @Default {True}
    */
  var showCharCount: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows ClearAll icon in the RTE footer.
    * @Default {false}
    */
  var showClearAll: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the clear format in the RTE footer.
    * @Default {true}
    */
  var showClearFormat: js.UndefOr[scala.Boolean] = js.undefined
  /** The showContextMenu property helps to enable custom context menu within editor area.
    * @Default {True}
    */
  var showContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the Custom Table in the RTE.
    * @Default {True}
    */
  var showCustomTable: js.UndefOr[scala.Boolean] = js.undefined
  /** This API is used to set the default dimensions for the image and video. When this property is set to true, the image and video dialog displays the dimension option.
    * @Default {false}
    */
  var showDimensions: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the FontOption in the RTE.
    * @Default {True}
    */
  var showFontOption: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows footer in the RTE. When the footer is enabled, it displays the HTML tag, word Count, character count, clear format, resize icon and clear all the content icons, by default.
    * @Default {false}
    */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the HtmlSource in the RTE footer.
    * @Default {false}
    */
  var showHtmlSource: js.UndefOr[scala.Boolean] = js.undefined
  /** When the cursor is placed or when the text is selected in the RTE, it displays the tag info in the footer.
    * @Default {True}
    */
  var showHtmlTagInfo: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables rounded corner UI look for RTE.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the toolbar in the RTE.
    * @Default {True}
    */
  var showToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Counts the total words and displays it in the RTE footer.
    * @Default {True}
    */
  var showWordCount: js.UndefOr[scala.Boolean] = js.undefined
  /** The given number of columns render the insert table pop.
    * @Default {10}
    */
  var tableColumns: js.UndefOr[scala.Double] = js.undefined
  /** The given number of rows render the insert table pop.
    * @Default {8}
    */
  var tableRows: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the overflow mode for RTE responsive toolbar
    * @Default {Popup}
    */
  var toolbarOverflowMode: js.UndefOr[ToolbarOverflowMode | java.lang.String] = js.undefined
  /** Sets the tools in the RTE and gets the inner display order of the corresponding group element. Tools are dependent on the toolsList property.
    * @Default {formatStyle: [format],style: [bold, italic, underline, strikethrough],alignment: [justifyLeft, justifyCenter, justifyRight, justifyFull],lists: [unorderedList,
    * orderedList],indenting: [outdent, indent],doAction: [undo, redo],links: [createLink,removeLink],images: [image],media: [video],tables: [createTable, addRowAbove, addRowBelow,
    * addColumnLeft, addColumnRight, deleteRow, deleteColumn, deleteTable]],view:[â€œfullScreenâ€,zoomIn,zoomOut],print:[print]}
    */
  var tools: js.UndefOr[Tools] = js.undefined
  /** Specifies the list of groups and order of those groups displayed in the RTE toolbar.  The toolsList property is used to get the root group order and tools property is used to get
    * the inner order of the corresponding groups displayed. When the value is not specified, it gets its default display order and tools.
    * @Default {[formatStyle, font, style, effects, alignment, lists, indenting, clipboard, doAction, clear, links, images, media, tables, casing,view, customTools,print,edit]}
    */
  var toolsList: js.UndefOr[js.Array[_]] = js.undefined
  /** Display the hints for the tools in the Toolbar.
    * @Default {{ associate: mouseenter, showShadow: true, position: { stem: { horizontal: left, vertical: top }  }, tip: { size: { width: 5, height: 5 }, isBalloon: false }}
    */
  var tooltipSettings: js.UndefOr[js.Any] = js.undefined
  /** Gets the undo stack limit.
    * @Default {50}
    */
  var undoStackLimit: js.UndefOr[scala.Double] = js.undefined
  /** Sets the jQuery validation error message to the Rich Text Editor.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Sets the jQuery validation rules to the Rich Text Editor.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** The given string value is displayed in the editable area.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the RTE textbox.
    * @Default {786}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Increases and decreases the contents zoom range in percentage
    * @Default {0.05}
    */
  var zoomStep: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowEditing: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    colorCode: js.Any = null,
    colorPaletteColumns: scala.Int | scala.Double = null,
    colorPaletteRows: scala.Int | scala.Double = null,
    contextMenuClick: js.Function1[/* e */ ContextMenuClickEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableHtmlEncode: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableTabKeyNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    enableXHTML: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    execute: js.Function1[/* e */ ExecuteEventArgs, scala.Unit] = null,
    exportToPdfSettings: ExportToPdfSettings = null,
    exportToWordSettings: ExportToWordSettings = null,
    externalCSS: java.lang.String = null,
    fileBrowser: FileBrowser = null,
    fontName: js.Any = null,
    fontSize: js.Any = null,
    format: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    htmlAttributes: js.Any = null,
    iframeAttributes: js.Any = null,
    imageBrowser: ImageBrowser = null,
    importSettings: ImportSettings = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    keydown: js.Function1[/* e */ KeydownEventArgs, scala.Unit] = null,
    keyup: js.Function1[/* e */ KeyupEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    maxHeight: java.lang.String | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxWidth: java.lang.String | scala.Double = null,
    minHeight: java.lang.String | scala.Double = null,
    minWidth: java.lang.String | scala.Double = null,
    name: java.lang.String = null,
    pasteCleanupSettings: PasteCleanupSettings = null,
    preRender: js.Function1[/* e */ PreRenderEventArgs, scala.Unit] = null,
    select: js.Function1[/* e */ SelectEventArgs, scala.Unit] = null,
    showCharCount: js.UndefOr[scala.Boolean] = js.undefined,
    showClearAll: js.UndefOr[scala.Boolean] = js.undefined,
    showClearFormat: js.UndefOr[scala.Boolean] = js.undefined,
    showContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    showCustomTable: js.UndefOr[scala.Boolean] = js.undefined,
    showDimensions: js.UndefOr[scala.Boolean] = js.undefined,
    showFontOption: js.UndefOr[scala.Boolean] = js.undefined,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showHtmlSource: js.UndefOr[scala.Boolean] = js.undefined,
    showHtmlTagInfo: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    showToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    showWordCount: js.UndefOr[scala.Boolean] = js.undefined,
    tableColumns: scala.Int | scala.Double = null,
    tableRows: scala.Int | scala.Double = null,
    toolbarOverflowMode: ToolbarOverflowMode | java.lang.String = null,
    tools: Tools = null,
    toolsList: js.Array[_] = null,
    tooltipSettings: js.Any = null,
    undoStackLimit: scala.Int | scala.Double = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: java.lang.String = null,
    width: java.lang.String | scala.Double = null,
    zoomStep: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (change != null) __obj.updateDynamic("change")(change)
    if (colorCode != null) __obj.updateDynamic("colorCode")(colorCode)
    if (colorPaletteColumns != null) __obj.updateDynamic("colorPaletteColumns")(colorPaletteColumns.asInstanceOf[js.Any])
    if (colorPaletteRows != null) __obj.updateDynamic("colorPaletteRows")(colorPaletteRows.asInstanceOf[js.Any])
    if (contextMenuClick != null) __obj.updateDynamic("contextMenuClick")(contextMenuClick)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableHtmlEncode)) __obj.updateDynamic("enableHtmlEncode")(enableHtmlEncode)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(enableTabKeyNavigation)) __obj.updateDynamic("enableTabKeyNavigation")(enableTabKeyNavigation)
    if (!js.isUndefined(enableXHTML)) __obj.updateDynamic("enableXHTML")(enableXHTML)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (execute != null) __obj.updateDynamic("execute")(execute)
    if (exportToPdfSettings != null) __obj.updateDynamic("exportToPdfSettings")(exportToPdfSettings)
    if (exportToWordSettings != null) __obj.updateDynamic("exportToWordSettings")(exportToWordSettings)
    if (externalCSS != null) __obj.updateDynamic("externalCSS")(externalCSS)
    if (fileBrowser != null) __obj.updateDynamic("fileBrowser")(fileBrowser)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (iframeAttributes != null) __obj.updateDynamic("iframeAttributes")(iframeAttributes)
    if (imageBrowser != null) __obj.updateDynamic("imageBrowser")(imageBrowser)
    if (importSettings != null) __obj.updateDynamic("importSettings")(importSettings)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pasteCleanupSettings != null) __obj.updateDynamic("pasteCleanupSettings")(pasteCleanupSettings)
    if (preRender != null) __obj.updateDynamic("preRender")(preRender)
    if (select != null) __obj.updateDynamic("select")(select)
    if (!js.isUndefined(showCharCount)) __obj.updateDynamic("showCharCount")(showCharCount)
    if (!js.isUndefined(showClearAll)) __obj.updateDynamic("showClearAll")(showClearAll)
    if (!js.isUndefined(showClearFormat)) __obj.updateDynamic("showClearFormat")(showClearFormat)
    if (!js.isUndefined(showContextMenu)) __obj.updateDynamic("showContextMenu")(showContextMenu)
    if (!js.isUndefined(showCustomTable)) __obj.updateDynamic("showCustomTable")(showCustomTable)
    if (!js.isUndefined(showDimensions)) __obj.updateDynamic("showDimensions")(showDimensions)
    if (!js.isUndefined(showFontOption)) __obj.updateDynamic("showFontOption")(showFontOption)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showHtmlSource)) __obj.updateDynamic("showHtmlSource")(showHtmlSource)
    if (!js.isUndefined(showHtmlTagInfo)) __obj.updateDynamic("showHtmlTagInfo")(showHtmlTagInfo)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (!js.isUndefined(showWordCount)) __obj.updateDynamic("showWordCount")(showWordCount)
    if (tableColumns != null) __obj.updateDynamic("tableColumns")(tableColumns.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    if (toolbarOverflowMode != null) __obj.updateDynamic("toolbarOverflowMode")(toolbarOverflowMode.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools)
    if (toolsList != null) __obj.updateDynamic("toolsList")(toolsList)
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings)
    if (undoStackLimit != null) __obj.updateDynamic("undoStackLimit")(undoStackLimit.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomStep != null) __obj.updateDynamic("zoomStep")(zoomStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

