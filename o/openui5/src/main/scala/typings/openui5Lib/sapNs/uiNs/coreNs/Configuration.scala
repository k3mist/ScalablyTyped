package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Configuration")
@js.native
/**
  * Creates a new Configuration object.
  */
class Configuration ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
    * Applies multiple changes to the configuration at once.If the changed settings contain localization
    * related settings like <code>language</code>or <ode>calendarType</code>, then only a single
    * <code>localizationChanged</code> event willbe fired. As the framework has to inform all existing
    * components, elements, models etc.about localization changes, using <code>applySettings</code> can
    * significantly reduce theoverhead for multiple changes, esp. when they occur after the UI has been
    * created already.The <code>mSettings</code> can contain any property <code><i>xyz</i></code> for
    * which asetter method <code>set<i>XYZ</i></code> exists in the API of this class.Similarly, values
    * for the {@link sap.ui.core.Configuration.FormatSettings format settings}API can be provided in a
    * nested object with name <code>formatSettings</code>.
    * @since 1.38.6
    * @param mSettings Configuration options to apply
    * @returns Returns <code>this</code> to allow method chaining
    */
  def applySettings(mSettings: js.Any): Configuration = js.native
  /**
    * Returns whether the accessibility mode is used or not
    * @returns whether the accessibility mode is used or not
    */
  def getAccessibility(): scala.Boolean = js.native
  /**
    * Returns whether the animations are globally used
    * @returns whether the animations are globally used
    */
  def getAnimation(): scala.Boolean = js.native
  /**
    * Base URLs to AppCacheBuster Etag-Index files
    * @returns array of base URLs
    */
  def getAppCacheBuster(): js.Array[java.lang.String] = js.native
  /**
    * Object defining the callback hooks for the AppCacheBuster like e.g.<code>handleURL</code>,
    * <code>onIndexLoad</code> or <code>onIndexLoaded</code>.
    * @returns object containing the callback functions for the AppCacheBuster
    */
  def getAppCacheBusterHooks(): js.Any = js.native
  /**
    * The loading mode (sync|async|batch) of the AppCacheBuster (sync is default)
    * @returns sync | async
    */
  def getAppCacheBusterMode(): java.lang.String = js.native
  /**
    * The name of the application to start or empty
    * @returns name of the application
    */
  def getApplication(): java.lang.String = js.native
  /**
    * Returns whether the framework automatically adds automaticallythe ARIA role 'application' to the
    * html body or not.
    * @since 1.27.0
    */
  def getAutoAriaBodyRole(): scala.Boolean = js.native
  /**
    * Returns the used compatibility version for the given feature.
    * @param sFeature the key of desired feature
    * @returns the used compatibility version
    */
  def getCompatibilityVersion(sFeature: java.lang.String): js.Any = js.native
  /**
    * Return whether the controller code is deactivated. During design mode the
    * @since 1.26.4
    * @returns whether the activation of the controller code is suppressed or not
    */
  def getControllerCodeDeactivated(): scala.Boolean = js.native
  /**
    * Returns whether the page runs in debug mode
    * @returns whether the page runs in debug mode
    */
  def getDebug(): scala.Boolean = js.native
  /**
    * Return whether the design mode is active or not.
    * @since 1.13.2
    * @returns whether the design mode is active or not.
    */
  def getDesignMode(): scala.Boolean = js.native
  /**
    * Returns whether the Fiori2Adaptation is on
    * @returns false - no adaptation, true - full adaptation, comma-separated list - partial
    * adaptationPossible values: style, collapse, title, back, hierarchy
    */
  def getFiori2Adaptation(): scala.Boolean | java.lang.String = js.native
  /**
    * Returns the format locale string with language and region code. Falls back tolanguage configuration,
    * in case it has not been explicitly defined.
    * @returns the format locale string with language and country code
    */
  def getFormatLocale(): java.lang.String = js.native
  /**
    * Returns a configuration object that bundles the format settings of UI5.
    * @returns A FormatSettings object.
    */
  def getFormatSettings(): openui5Lib.sapNs.uiNs.coreNs.ConfigurationNs.FormatSettings = js.native
  /**
    * frameOptions mode (allow/deny/trusted).
    * @returns frameOptions mode
    */
  def getFrameOptions(): java.lang.String = js.native
  /**
    * Returns whether the UI5 control inspector is displayedHas only an effect when the sap-ui-debug
    * module has been loaded
    * @returns whether the UI5 control inspector is displayed
    */
  def getInspect(): scala.Boolean = js.native
  /**
    * Returns a string that identifies the current language.The value returned by this methods in most
    * cases corresponds to the exact value that has beenconfigured by the user or application or that has
    * been determined from the user agent settings.It neither has been normalized nor validated against a
    * specification or standard, althoughUI5 expects a value compliant with {@link
    * http://www.ietf.org/rfc/bcp/bcp47.txt BCP47}.The exceptions mentioned above affect languages that
    * have been specified via the URL parameter<code>sap-language</code>. That parameter by definition
    * represents a SAP logon language code('ABAP language'). Most but not all of these language codes are
    * valid ISO639 two-letter languagesand as such are valid BCP47 language tags. For better BCP47
    * compliance, the frameworkmaps the following non-BCP47 SAP logon codes to a BCP47 substitute:<pre>  
    * "ZH"  -->  "zh-Hans"         // script 'Hans' added to distinguish it from zh-Hant   "ZF"  --> 
    * "zh-Hant"         // ZF ist not a valid ISO639 code, use the compliant language + script 'Hant'		 " 
    *   "1Q"  -->  "en-US-x-saptrc"  // special language code for supportability (tracing),               
    *                    represented as en-US with a priate extension   "2Q"  -->  "en-US-x-sappsd"  //
    * special language code for supportability (pseudo translation),                                  
    * represented as en-US with a priate extension</pre>
    * @returns The language string as configured
    */
  def getLanguage(): java.lang.String = js.native
  /**
    * Returns a BCP47-compliant language tag for the current language.If the current {@link #getLanguage
    * language} can't be interpreted as aBCP47-compliant language, then the value <code>undefined</code>
    * is returned.
    * @returns The language tag for the current language, conforming to BCP47
    */
  def getLanguageTag(): java.lang.String = js.native
  /**
    * Returns a Locale object for the current language.The Locale is derived from the {@link #getLanguage
    * language} property.
    * @returns The locale
    */
  def getLocale(): Locale = js.native
  /**
    * Flag whether a Component should load the manifest first
    * @since 1.33.0
    * @returns true if a Component should load the manifest first
    */
  def getManifestFirst(): scala.Boolean = js.native
  /**
    * Returns whether there should be an exception on any duplicate element IDs
    * @returns whether there should be an exception on any duplicate element IDs
    */
  def getNoDuplicateIds(): scala.Boolean = js.native
  /**
    * Returns whether the text origin information is collected
    * @returns whether the text info is collected
    */
  def getOriginInfo(): scala.Boolean = js.native
  /**
    * Returns whether the page uses the RTL text direction.If no mode has been explicitly set (neither
    * true nor false),the mode is derived from the current language setting.
    * @returns whether the page uses the RTL text direction
    */
  def getRTL(): scala.Boolean = js.native
  /**
    * The name of the root component to start or empty
    * @returns name of the root component
    */
  def getRootComponent(): java.lang.String = js.native
  /**
    * Returns a SAP logon language for the current language.If the current {@link #getLanguage language}
    * can't be interpreted as aBCP47-compliant language, or if the BCP47 language can't be converted toa
    * SAP Logon language, then the value <code>undefined</code> is returned.
    * @returns The SAP logon language code for the current language
    */
  def getSAPLogonLanguage(): java.lang.String = js.native
  /**
    * Return whether the activation of the controller code is suppressed
    * @since 1.13.2
    * @returns whether the activation of the controller code is suppressed or not
    */
  def getSuppressDeactivationOfControllerCode(): scala.Boolean = js.native
  /**
    * Returns the theme name
    * @returns the theme name
    */
  def getTheme(): java.lang.String = js.native
  /**
    * Prefix to be used for automatically generated control IDs.Default is a double underscore "__".
    * @returns the prefix to be used
    */
  def getUIDPrefix(): java.lang.String = js.native
  /**
    * Returns the version of the framework.Similar to <code>sap.ui.version</code>.
    * @returns the version
    */
  def getVersion(): js.Any = js.native
  /**
    * URL of the whitelist service.
    * @returns whitelist service URL
    */
  def getWhitelistService(): java.lang.String = js.native
  def setCalendarType(sCalendarType: js.Any): Configuration = js.native
  /**
    * Sets the new calendar type to be used from now on in locale dependent functionalities (for
    * example,formatting, translation texts, etc.).
    * @since 1.28.6
    * @param sCalendarType the new calendar type. Set it with null to clear the calendar type  and the
    * calendar type is calculated based on the format settings and current locale.
    * @returns <code>this</code> to allow method chaining
    */
  def setCalendarType(sCalendarType: CalendarType): Configuration = js.native
  /**
    * Sets a new formatLocale to be used from now on for retrieving localespecific formatters. Modifying
    * this setting does not have an impact onthe retrieval of translated texts!Can either be set to a
    * concrete value (a BCP-47 or Java locale compliantlanguage tag) or to <code>null</code>. When set to
    * <code>null</code> (defaultvalue) then locale specific formatters are retrieved for the current
    * language.After changing the formatLocale, the framework tries to update localizationspecific parts
    * of the UI. See the documentation of {@link #setLanguage} fordetails and restrictions.
    * @param sFormatLocale the new format locale as a BCP47 compliant language tag;  case doesn't matter
    * and underscores can be used instead of a dashes to separate  components (compatibility with Java
    * Locale Ids)
    * @returns <code>this</code> to allow method chaining
    */
  def setFormatLocale(sFormatLocale: java.lang.String): Configuration = js.native
  def setFormatLocale(sFormatLocale: js.Any): Configuration = js.native
  /**
    * Sets a new language to be used from now on for language/region dependentfunctionality (e.g.
    * formatting, data types, translated texts, ...).When the language has changed, the Core will fire
    * its{@link sap.ui.core.Core#event:localizationChanged localizationChanged} event.The framework
    * <strong>does not</strong> guarantee that already created, languagedependent objects will be updated
    * by this call. It therefore remains best practicefor applications to switch the language early, e.g.
    * before any language dependentobjects are created. Applications that need to support more dynamic
    * changes ofthe language should listen to the <code>localizationChanged</code> event and adaptall
    * language dependent objects that they use (e.g. by rebuilding their UI).Currently, the framework
    * notifies the following objects about a change of thelocalization settings before it fires the
    * <code>localizationChanged</code> event:<ul><li>date and number data types that are used in property
    * bindings or composite    bindings in existing Elements, Controls, UIAreas or
    * Components</li><li>ResourceModels currently assigned to the Core, an UIArea, Component,    Element
    * or Control</li><li>Elements or Controls that implement the <code>onlocalizationChanged</code> hook  
    *  (note the lowercase 'l' in onlocalizationChanged)</ul>It furthermore derives the RTL mode from the
    * new language, if no explicit RTLmode has been set. If the RTL mode changes, the following additional
    * actions will be taken:<ul><li>the URLs of already loaded library theme files will be
    * changed</li><li>the <code>dir</code> attribute of the page will be changed to reflect the new
    * mode.</li><li>all UIAreas will be invalidated (which results in a rendering of the whole UI5
    * UI)</li></ul>This method does not handle SAP logon language codes.
    * @param sLanguage the new language as a BCP47 compliant language tag; case doesn't matter  and
    * underscores can be used instead of a dashes to separate components (compatibility with Java Locale
    * Ids)
    * @returns <code>this</code> to allow method chaining
    */
  def setLanguage(sLanguage: java.lang.String): Configuration = js.native
  def setRTL(bRTL: js.Any): Configuration = js.native
  /**
    * Sets the character orientation mode to be used from now on.Can either be set to a concrete value
    * (true meaning right-to-left,false meaning left-to-right) or to <code>null</code> which means thatthe
    * character orientation mode should be derived from the currentlanguage (incl. region) setting.After
    * changing the character orientation mode, the framework triesto update localization specific parts of
    * the UI. See the documentation of{@link #setLanguage} for details and restrictions.
    * @param bRTL new character orientation mode or <code>null</code>
    * @returns <code>this</code> to allow method chaining
    */
  def setRTL(bRTL: scala.Boolean): Configuration = js.native
}

