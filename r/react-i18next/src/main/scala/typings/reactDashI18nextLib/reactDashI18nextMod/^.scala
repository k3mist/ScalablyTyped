package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val I18nextProvider: reactLib.reactMod.ReactNs.FunctionComponent[I18nextProviderProps] = js.native
  val initReactI18next: reactDashI18nextLib.Anon_Init = js.native
  def Trans(props: TransProps): js.Any = js.native
  def Translation(props: TranslationProps): js.Any = js.native
  def addUsedNamespaces(namespaces: js.Array[Namespace]): scala.Unit = js.native
  def composeInitialProps(ForComponent: js.Any): js.Function1[/* ctx */ js.Any, js.Promise[_]] = js.native
  def getDefaults(): i18nextLib.i18nextMod.i18nextNs.ReactOptions = js.native
  def getI18n(): i18nextLib.i18nextMod.i18nextNs.i18n = js.native
  def getInitialProps(): reactDashI18nextLib.Anon_InitialI18nStore = js.native
  def getUsedNamespaces(): js.Array[java.lang.String] = js.native
  def setDefaults(options: i18nextLib.i18nextMod.i18nextNs.ReactOptions): scala.Unit = js.native
  def setI18n(instance: i18nextLib.i18nextMod.i18nextNs.i18n): scala.Unit = js.native
  def useSSR(initialI18nStore: js.Any, initialLanguage: js.Any): scala.Unit = js.native
  def useTranslation(): UseTranslationResponse = js.native
  def useTranslation(ns: Namespace): UseTranslationResponse = js.native
  def useTranslation(ns: Namespace, options: UseTranslationOptions): UseTranslationResponse = js.native
  def withSSR(): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentClass[js.Object, _], 
    reactDashI18nextLib.Anon_Ctx
  ] = js.native
  def withTranslation(): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithTranslation], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Omit[
        WithTranslation, 
        reactDashI18nextLib.reactDashI18nextLibStrings.i18n | reactDashI18nextLib.reactDashI18nextLibStrings.tReady
      ]
    ]
  ] = js.native
  def withTranslation(ns: Namespace): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithTranslation], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Omit[
        WithTranslation, 
        reactDashI18nextLib.reactDashI18nextLibStrings.i18n | reactDashI18nextLib.reactDashI18nextLibStrings.tReady
      ]
    ]
  ] = js.native
}

