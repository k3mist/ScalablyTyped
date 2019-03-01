package typings
package reactDashNativeDashMaterialDashTextfieldLib.reactDashNativeDashMaterialDashTextfieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps
  extends reactDashNativeLib.reactDashNativeMod.TextInputProps {
  var activeLineWidth: js.UndefOr[scala.Double] = js.undefined
  var affixTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var baseColor: js.UndefOr[java.lang.String] = js.undefined
  var characterRestriction: js.UndefOr[scala.Double] = js.undefined
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledLineWidth: js.UndefOr[scala.Double] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var errorColor: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var inputContainerPadding: js.UndefOr[scala.Double] = js.undefined
  var inputContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelFontSize: js.UndefOr[scala.Double] = js.undefined
  var labelHeight: js.UndefOr[scala.Double] = js.undefined
  var labelPadding: js.UndefOr[scala.Double] = js.undefined
  var labelTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ reactLib.Event, scala.Unit]] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var renderAccessory: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  @JSName("style")
  var style_TextFieldProps: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
  var titleTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object TextFieldProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    activeLineWidth: scala.Int | scala.Double = null,
    affixTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    autoCapitalize: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.sentences | reactDashNativeLib.reactDashNativeLibStrings.words | reactDashNativeLib.reactDashNativeLibStrings.characters = null,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    baseColor: java.lang.String = null,
    blurOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    caretHidden: js.UndefOr[scala.Boolean] = js.undefined,
    characterRestriction: scala.Int | scala.Double = null,
    clearButtonMode: reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.`while-editing` | reactDashNativeLib.reactDashNativeLibStrings.`unless-editing` | reactDashNativeLib.reactDashNativeLibStrings.always = null,
    clearTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    contextMenuHidden: js.UndefOr[scala.Boolean] = js.undefined,
    dataDetectorTypes: reactDashNativeLib.DataDetectorTypes | js.Array[reactDashNativeLib.DataDetectorTypes] = null,
    defaultValue: java.lang.String = null,
    disableFullscreenUI: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledLineWidth: scala.Int | scala.Double = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[scala.Boolean] = js.undefined,
    error: java.lang.String = null,
    errorColor: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    hitSlop: reactDashNativeLib.reactDashNativeMod.Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    inlineImageLeft: java.lang.String = null,
    inlineImagePadding: scala.Int | scala.Double = null,
    inputAccessoryViewID: java.lang.String = null,
    inputContainerPadding: scala.Int | scala.Double = null,
    inputContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    keyboardAppearance: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.light | reactDashNativeLib.reactDashNativeLibStrings.dark = null,
    keyboardType: reactDashNativeLib.reactDashNativeMod.KeyboardTypeOptions = null,
    label: java.lang.String = null,
    labelFontSize: scala.Int | scala.Double = null,
    labelHeight: scala.Int | scala.Double = null,
    labelPadding: scala.Int | scala.Double = null,
    labelTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    lineWidth: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfLines: scala.Int | scala.Double = null,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onBlur: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputFocusEventData], 
      scala.Unit
    ] = null,
    onChange: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputChangeEventData], 
      scala.Unit
    ] = null,
    onChangeText: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    onContentSizeChange: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputContentSizeChangeEventData], 
      scala.Unit
    ] = null,
    onEndEditing: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputEndEditingEventData], 
      scala.Unit
    ] = null,
    onFocus: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputFocusEventData], 
      scala.Unit
    ] = null,
    onKeyPress: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputKeyPressEventData], 
      scala.Unit
    ] = null,
    onLayout: js.Function1[/* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent, scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onMoveShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onPress: js.Function1[/* event */ reactLib.Event, scala.Unit] = null,
    onResponderEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderGrant: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderReject: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderRelease: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminate: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminationRequest: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onScroll: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputScrollEventData], 
      scala.Unit
    ] = null,
    onSelectionChange: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputSelectionChangeEventData], 
      scala.Unit
    ] = null,
    onStartShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onStartShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onSubmitEditing: js.Function1[
      /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputSubmitEditingEventData], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchEndCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    placeholder: java.lang.String = null,
    placeholderTextColor: java.lang.String = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    prefix: java.lang.String = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderAccessory: js.Function0[reactLib.reactMod.Global.JSXNs.Element] = null,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    returnKeyLabel: java.lang.String = null,
    returnKeyType: reactDashNativeLib.reactDashNativeMod.ReturnKeyTypeOptions = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[scala.Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    selection: reactDashNativeLib.Anon_EndStart = null,
    selectionColor: java.lang.String = null,
    selectionState: reactDashNativeLib.reactDashNativeMod.DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    style_TextInputProps: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    suffix: java.lang.String = null,
    testID: java.lang.String = null,
    textBreakStrategy: reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced = null,
    textColor: java.lang.String = null,
    textContentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.URL | reactDashNativeLib.reactDashNativeLibStrings.addressCity | reactDashNativeLib.reactDashNativeLibStrings.addressCityAndState | reactDashNativeLib.reactDashNativeLibStrings.addressState | reactDashNativeLib.reactDashNativeLibStrings.countryName | reactDashNativeLib.reactDashNativeLibStrings.creditCardNumber | reactDashNativeLib.reactDashNativeLibStrings.emailAddress | reactDashNativeLib.reactDashNativeLibStrings.familyName | reactDashNativeLib.reactDashNativeLibStrings.fullStreetAddress | reactDashNativeLib.reactDashNativeLibStrings.givenName | reactDashNativeLib.reactDashNativeLibStrings.jobTitle | reactDashNativeLib.reactDashNativeLibStrings.location | reactDashNativeLib.reactDashNativeLibStrings.middleName | reactDashNativeLib.reactDashNativeLibStrings.name | reactDashNativeLib.reactDashNativeLibStrings.namePrefix | reactDashNativeLib.reactDashNativeLibStrings.nameSuffix | reactDashNativeLib.reactDashNativeLibStrings.nickname | reactDashNativeLib.reactDashNativeLibStrings.organizationName | reactDashNativeLib.reactDashNativeLibStrings.postalCode | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine1 | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine2 | reactDashNativeLib.reactDashNativeLibStrings.sublocality | reactDashNativeLib.reactDashNativeLibStrings.telephoneNumber | reactDashNativeLib.reactDashNativeLibStrings.username | reactDashNativeLib.reactDashNativeLibStrings.password | reactDashNativeLib.reactDashNativeLibStrings.newPassword | reactDashNativeLib.reactDashNativeLibStrings.oneTimeCode = null,
    tintColor: java.lang.String = null,
    title: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    underlineColorAndroid: java.lang.String = null,
    value: java.lang.String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (activeLineWidth != null) __obj.updateDynamic("activeLineWidth")(activeLineWidth.asInstanceOf[js.Any])
    if (affixTextStyle != null) __obj.updateDynamic("affixTextStyle")(affixTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (baseColor != null) __obj.updateDynamic("baseColor")(baseColor)
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit)
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden)
    if (characterRestriction != null) __obj.updateDynamic("characterRestriction")(characterRestriction.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden)
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledLineWidth != null) __obj.updateDynamic("disabledLineWidth")(disabledLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft)
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID)
    if (inputContainerPadding != null) __obj.updateDynamic("inputContainerPadding")(inputContainerPadding.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelHeight != null) __obj.updateDynamic("labelHeight")(labelHeight.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelTextStyle != null) __obj.updateDynamic("labelTextStyle")(labelTextStyle.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText)
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(onContentSizeChange)
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(onEndEditing)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(onSelectionChange)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(onSubmitEditing)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (renderAccessory != null) __obj.updateDynamic("renderAccessory")(renderAccessory)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel)
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(secureTextEntry)) __obj.updateDynamic("secureTextEntry")(secureTextEntry)
    if (!js.isUndefined(selectTextOnFocus)) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (style_TextInputProps != null) __obj.updateDynamic("style")(style_TextInputProps.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextFieldProps]
  }
}

