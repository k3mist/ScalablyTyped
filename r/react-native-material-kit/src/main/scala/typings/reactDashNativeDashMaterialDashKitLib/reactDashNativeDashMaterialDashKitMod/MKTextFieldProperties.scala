package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.FloatingLabelProperties because var conflicts: allowFontScaling. Inlined floatingLabelEnabled, floatingLabelAniDuration, floatingLabelBottomMargin, floatingLabelFont */ trait MKTextFieldProperties
  extends reactDashNativeLib.reactDashNativeMod.TextInputProps {
  var additionalInputProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextInputProps] = js.undefined
  var floatingLabelAniDuration: js.UndefOr[scala.Double] = js.undefined
  var floatingLabelBottomMargin: js.UndefOr[scala.Double] = js.undefined
  var floatingLabelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var floatingLabelFont: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.MKPropTypesNs.font
  ] = js.undefined
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* val */ java.lang.String, scala.Unit]] = js.undefined
  var password: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textInputStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var underlineEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var underlineSize: js.UndefOr[scala.Double] = js.undefined
}

object MKTextFieldProperties {
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
    additionalInputProps: reactDashNativeLib.reactDashNativeMod.TextInputProps = null,
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    autoCapitalize: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.sentences | reactDashNativeLib.reactDashNativeLibStrings.words | reactDashNativeLib.reactDashNativeLibStrings.characters = null,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    blurOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    caretHidden: js.UndefOr[scala.Boolean] = js.undefined,
    clearButtonMode: reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.`while-editing` | reactDashNativeLib.reactDashNativeLibStrings.`unless-editing` | reactDashNativeLib.reactDashNativeLibStrings.always = null,
    clearTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    contextMenuHidden: js.UndefOr[scala.Boolean] = js.undefined,
    dataDetectorTypes: reactDashNativeLib.DataDetectorTypes | js.Array[reactDashNativeLib.DataDetectorTypes] = null,
    defaultValue: java.lang.String = null,
    disableFullscreenUI: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelAniDuration: scala.Int | scala.Double = null,
    floatingLabelBottomMargin: scala.Int | scala.Double = null,
    floatingLabelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelFont: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.MKPropTypesNs.font = null,
    highlightColor: java.lang.String = null,
    hitSlop: reactDashNativeLib.reactDashNativeMod.Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    inlineImageLeft: java.lang.String = null,
    inlineImagePadding: scala.Int | scala.Double = null,
    inputAccessoryViewID: java.lang.String = null,
    keyboardAppearance: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.light | reactDashNativeLib.reactDashNativeLibStrings.dark = null,
    keyboardType: reactDashNativeLib.reactDashNativeMod.KeyboardTypeOptions = null,
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
    onTextChange: js.Function1[/* val */ java.lang.String, scala.Unit] = null,
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
    password: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    placeholderTextColor: java.lang.String = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
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
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    style_TextInputProps: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    testID: java.lang.String = null,
    text: java.lang.String = null,
    textBreakStrategy: reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced = null,
    textContentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.URL | reactDashNativeLib.reactDashNativeLibStrings.addressCity | reactDashNativeLib.reactDashNativeLibStrings.addressCityAndState | reactDashNativeLib.reactDashNativeLibStrings.addressState | reactDashNativeLib.reactDashNativeLibStrings.countryName | reactDashNativeLib.reactDashNativeLibStrings.creditCardNumber | reactDashNativeLib.reactDashNativeLibStrings.emailAddress | reactDashNativeLib.reactDashNativeLibStrings.familyName | reactDashNativeLib.reactDashNativeLibStrings.fullStreetAddress | reactDashNativeLib.reactDashNativeLibStrings.givenName | reactDashNativeLib.reactDashNativeLibStrings.jobTitle | reactDashNativeLib.reactDashNativeLibStrings.location | reactDashNativeLib.reactDashNativeLibStrings.middleName | reactDashNativeLib.reactDashNativeLibStrings.name | reactDashNativeLib.reactDashNativeLibStrings.namePrefix | reactDashNativeLib.reactDashNativeLibStrings.nameSuffix | reactDashNativeLib.reactDashNativeLibStrings.nickname | reactDashNativeLib.reactDashNativeLibStrings.organizationName | reactDashNativeLib.reactDashNativeLibStrings.postalCode | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine1 | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine2 | reactDashNativeLib.reactDashNativeLibStrings.sublocality | reactDashNativeLib.reactDashNativeLibStrings.telephoneNumber | reactDashNativeLib.reactDashNativeLibStrings.username | reactDashNativeLib.reactDashNativeLibStrings.password | reactDashNativeLib.reactDashNativeLibStrings.newPassword | reactDashNativeLib.reactDashNativeLibStrings.oneTimeCode = null,
    textInputStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    tintColor: java.lang.String = null,
    underlineColorAndroid: java.lang.String = null,
    underlineEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    underlineSize: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): MKTextFieldProperties = {
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
    if (additionalInputProps != null) __obj.updateDynamic("additionalInputProps")(additionalInputProps)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit)
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden)
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden)
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically)
    if (floatingLabelAniDuration != null) __obj.updateDynamic("floatingLabelAniDuration")(floatingLabelAniDuration.asInstanceOf[js.Any])
    if (floatingLabelBottomMargin != null) __obj.updateDynamic("floatingLabelBottomMargin")(floatingLabelBottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelEnabled)) __obj.updateDynamic("floatingLabelEnabled")(floatingLabelEnabled)
    if (floatingLabelFont != null) __obj.updateDynamic("floatingLabelFont")(floatingLabelFont)
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft)
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID)
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
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
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(onTextChange)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(password)) __obj.updateDynamic("password")(password)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
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
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (textInputStyle != null) __obj.updateDynamic("textInputStyle")(textInputStyle)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid)
    if (!js.isUndefined(underlineEnabled)) __obj.updateDynamic("underlineEnabled")(underlineEnabled)
    if (underlineSize != null) __obj.updateDynamic("underlineSize")(underlineSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MKTextFieldProperties]
  }
}

