package typings
package mendixmodelsdkLib.distGenDomainmodelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels")
@js.native
object domainmodelsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/access-rules relevant section in reference guide}
    */
  @js.native
  class AccessRule protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var allowCreate: scala.Boolean = js.native
    var allowDelete: scala.Boolean = js.native
    val containerAsAccessRuleContainerBase: mendixmodelsdkLib.distGenSecurityMod.securityNs.AccessRuleContainerBase = js.native
    val containerAsEntity: Entity = js.native
    var defaultMemberAccessRights: MemberAccessRights = js.native
    var documentation: java.lang.String = js.native
    val memberAccesses: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MemberAccess] = js.native
    @JSName("model")
    var model_AccessRule: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val moduleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val moduleRolesQualifiedNames: js.Array[java.lang.String] = js.native
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var xPathConstraint: java.lang.String = js.native
  }
  
  @js.native
  class ActionMoment ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotations relevant section in reference guide}
    */
  @js.native
  class Annotation protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    val containerAsDomainModel: DomainModel = js.native
    var location: mendixmodelsdkLib.distCommonMod.commonNs.IPoint = js.native
    @JSName("model")
    var model_Annotation: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var width: scala.Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociation because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined child, asLoaded, load, load, load, load */ @js.native
  class Association protected () extends AssociationBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var child: Entity | IEntity = js.native
    var childConnection: mendixmodelsdkLib.distCommonMod.commonNs.IPoint = js.native
    @JSName("containerAsDomainModel")
    val containerAsDomainModel_Association: DomainModel = js.native
    var parentConnection: mendixmodelsdkLib.distCommonMod.commonNs.IPoint = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, `type`, owner, parent, asLoaded, load, load, load, load */ @js.native
  abstract class AssociationBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDomainModel: DomainModel | IDomainModel = js.native
    var dataStorageGuid: java.lang.String = js.native
    var deleteBehavior: AssociationDeleteBehavior = js.native
    var documentation: java.lang.String = js.native
    @JSName("model")
    var model_AssociationBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var owner: AssociationOwner = js.native
    var parent: Entity | IEntity = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    var `type`: AssociationType = js.native
  }
  
  @js.native
  class AssociationDeleteBehavior protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var childDeleteBehavior: DeletingBehavior = js.native
    var childErrorMessage: mendixmodelsdkLib.distGenTextsMod.textsNs.Text | scala.Null = js.native
    val containerAsAssociationBase: AssociationBase = js.native
    @JSName("model")
    var model_AssociationDeleteBehavior: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parentDeleteBehavior: DeletingBehavior = js.native
    var parentErrorMessage: mendixmodelsdkLib.distGenTextsMod.textsNs.Text | scala.Null = js.native
  }
  
  @js.native
  class AssociationOwner ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class AssociationRef protected () extends MemberRef {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: IAssociationBase = js.native
    val associationQualifiedName: java.lang.String = js.native
  }
  
  @js.native
  class AssociationType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, name, `type`, value, asLoaded, load, load, load, load */ @js.native
  class Attribute protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsEntity: Entity | IEntity = js.native
    var dataStorageGuid: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    @JSName("model")
    var model_Attribute: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    var `type`: AttributeType | IAttributeType = js.native
    /**
      * In version 6.6.0: added public
      */
    var value: IValueType | ValueType = js.native
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class AttributeRef protected () extends MemberRef {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: IAttribute = js.native
    val attributeQualifiedName: java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute, asLoaded, load, load, load, load */ @js.native
  abstract class AttributeType protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsAttribute: Attribute | IAttribute = js.native
    @JSName("model")
    var model_AttributeType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAutoNumberAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class AutoNumberAttributeType protected () extends IntegerAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IBinaryAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class BinaryAttributeType protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_BinaryAttributeType: Attribute = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IBooleanAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class BooleanAttributeType protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_BooleanAttributeType: Attribute = js.native
  }
  
  /**
    * In version 6.6.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ICalculatedValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class CalculatedValue protected () extends ValueType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_CalculatedValue: Attribute = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    var passEntity: scala.Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ICrossAssociation because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined child, childQualifiedName, asLoaded, load, load, load, load */ @js.native
  class CrossAssociation protected () extends AssociationBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var child: IEntity = js.native
    val childQualifiedName: java.lang.String = js.native
    @JSName("containerAsDomainModel")
    val containerAsDomainModel_CrossAssociation: DomainModel = js.native
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ICurrencyAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class CurrencyAttributeType protected () extends FloatAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDateTimeAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class DateTimeAttributeType protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_DateTimeAttributeType: Attribute = js.native
    var localizeDate: scala.Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDecimalAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class DecimalAttributeType protected () extends DecimalAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDecimalAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  abstract class DecimalAttributeTypeBase protected () extends NumericAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class DeletingBehavior ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class DirectEntityRef protected () extends EntityRef {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDomainModel because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entities, associations, crossAssociations, asLoaded, load, load, load, load */ @js.native
  class DomainModel protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.ModuleDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule) = this()
    val annotations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Annotation] = js.native
    val associations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Association | IAssociation] = js.native
    @JSName("containerAsModule")
    val containerAsModule_DomainModel: mendixmodelsdkLib.distGenProjectsMod.projectsNs.Module = js.native
    val crossAssociations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[CrossAssociation | ICrossAssociation] = js.native
    var documentation: java.lang.String = js.native
    val entities: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Entity | IEntity] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, generalization, attributes, asLoaded, load, load, load, load */ @js.native
  class Entity protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val accessRules: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[AccessRule] = js.native
    val attributes: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Attribute | IAttribute] = js.native
    val containerAsDomainModel: DomainModel | IDomainModel = js.native
    var dataStorageGuid: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    val eventHandlers: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[EventHandler] = js.native
    var generalization: GeneralizationBase | IGeneralizationBase = js.native
    var image: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val imageQualifiedName: java.lang.String | scala.Null = js.native
    val indexes: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Index] = js.native
    /**
      * In version 7.17.0: introduced
      */
    var isRemote: scala.Boolean = js.native
    var location: mendixmodelsdkLib.distCommonMod.commonNs.IPoint = js.native
    @JSName("model")
    var model_Entity: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 7.17.0: introduced
      */
    var remoteSource: java.lang.String = js.native
    val validationRules: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ValidationRule] = js.native
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  abstract class EntityRef protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsCreateObjectClientAction: mendixmodelsdkLib.distGenPagesMod.pagesNs.CreateObjectClientAction = js.native
    val containerAsEntityPathSource: mendixmodelsdkLib.distGenPagesMod.pagesNs.EntityPathSource = js.native
    val containerAsEntityWidget: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.EntityWidget = js.native
    val containerAsMemberRef: MemberRef = js.native
    val containerAsNewButton: mendixmodelsdkLib.distGenPagesMod.pagesNs.NewButton = js.native
    val containerAsReferenceSetSelector: mendixmodelsdkLib.distGenPagesMod.pagesNs.ReferenceSetSelector = js.native
    val containerAsSelectorXPathSource: mendixmodelsdkLib.distGenPagesMod.pagesNs.SelectorXPathSource = js.native
    val containerAsWidgetValue: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue = js.native
    @JSName("model")
    var model_EntityRef: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class EntityRefStep protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: IAssociationBase = js.native
    val associationQualifiedName: java.lang.String = js.native
    val containerAsIndirectEntityRef: IndirectEntityRef = js.native
    var destinationEntity: IEntity = js.native
    val destinationEntityQualifiedName: java.lang.String = js.native
    @JSName("model")
    var model_EntityRefStep: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEnumerationAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName, asLoaded, load, load, load, load */ @js.native
  class EnumerationAttributeType protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_EnumerationAttributeType: Attribute = js.native
    var enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  @js.native
  class EqualsToRuleInfo protected () extends RuleInfo {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var equalsToAttribute: IAttribute | scala.Null = js.native
    val equalsToAttributeQualifiedName: java.lang.String | scala.Null = js.native
    var equalsToValue: java.lang.String = js.native
    var useValue: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/event-handlers relevant section in reference guide}
    */
  @js.native
  class EventHandler protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsEntity: Entity = js.native
    var event: EventType = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_EventHandler: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var moment: ActionMoment = js.native
    var passEventObject: scala.Boolean = js.native
    var raiseErrorOnFalse: scala.Boolean = js.native
  }
  
  @js.native
  class EventType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 6.0.0: deprecated
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IFloatAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class FloatAttributeType protected () extends FloatAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IFloatAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  abstract class FloatAttributeTypeBase protected () extends DecimalAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IGeneralization because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined generalization, generalizationQualifiedName, asLoaded, load, load, load, load */ @js.native
  class Generalization protected () extends GeneralizationBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsEntity")
    val containerAsEntity_Generalization: Entity = js.native
    var generalization: IEntity = js.native
    val generalizationQualifiedName: java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IGeneralizationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, asLoaded, load, load, load, load */ @js.native
  abstract class GeneralizationBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsEntity: Entity | IEntity = js.native
    @JSName("model")
    var model_GeneralizationBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IHashedStringAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class HashedStringAttributeType protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_HashedStringAttributeType: Attribute = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  @js.native
  trait IAssociation extends IAssociationBase {
    /**
      * This property is required and cannot be set to null.
      */
    val child: IEntity = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
    */
  @js.native
  trait IAssociationBase
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsDomainModel: IDomainModel = js.native
    @JSName("model")
    val model_IAssociationBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
    val owner: AssociationOwner = js.native
    /**
      * This property is required and cannot be set to null.
      */
    val parent: IEntity = js.native
    val `type`: AssociationType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
    */
  @js.native
  trait IAttribute
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsEntity: IEntity = js.native
    @JSName("model")
    val model_IAttribute: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
    /**
      * This property is required and cannot be set to null.
      */
    val `type`: IAttributeType = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 6.6.0: added public
      */
    val value: IValueType = js.native
  }
  
  @js.native
  trait IAttributeType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsAttribute: IAttribute = js.native
    @JSName("model")
    val model_IAttributeType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  trait IAutoNumberAttributeType extends IIntegerAttributeTypeBase
  
  @js.native
  trait IBinaryAttributeType extends IAttributeType
  
  @js.native
  trait IBooleanAttributeType extends IAttributeType
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  trait ICalculatedValue extends IValueType
  
  @js.native
  trait ICrossAssociation extends IAssociationBase {
    /**
      * This property is required and cannot be set to null.
      */
    val child: IEntity = js.native
    val childQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  @js.native
  trait ICurrencyAttributeType extends IFloatAttributeTypeBase
  
  @js.native
  trait IDateTimeAttributeType extends IAttributeType
  
  @js.native
  trait IDecimalAttributeType extends IDecimalAttributeTypeBase
  
  @js.native
  trait IDecimalAttributeTypeBase extends INumericAttributeTypeBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
    */
  @js.native
  trait IDomainModel
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModuleDocument {
    val associations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IAssociation] = js.native
    val crossAssociations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ICrossAssociation] = js.native
    val entities: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IEntity] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
    */
  @js.native
  trait IEntity
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val attributes: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IAttribute] = js.native
    val containerAsDomainModel: IDomainModel = js.native
    /**
      * This property is required and cannot be set to null.
      */
    val generalization: IGeneralizationBase = js.native
    @JSName("model")
    val model_IEntity: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  @js.native
  trait IEnumerationAttributeType extends IAttributeType {
    /**
      * This property is required and cannot be set to null.
      */
    val enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 6.0.0: deprecated
    */
  @js.native
  trait IFloatAttributeType extends IFloatAttributeTypeBase
  
  @js.native
  trait IFloatAttributeTypeBase extends IDecimalAttributeTypeBase
  
  @js.native
  trait IGeneralization extends IGeneralizationBase {
    /**
      * This property is required and cannot be set to null.
      */
    val generalization: IEntity = js.native
    val generalizationQualifiedName: java.lang.String = js.native
  }
  
  @js.native
  trait IGeneralizationBase
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsEntity: IEntity = js.native
    @JSName("model")
    val model_IGeneralizationBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  trait IHashedStringAttributeType extends IAttributeType
  
  @js.native
  trait IIntegerAttributeType extends IIntegerAttributeTypeBase
  
  @js.native
  trait IIntegerAttributeTypeBase extends INumericAttributeTypeBase
  
  @js.native
  trait ILongAttributeType extends IIntegerAttributeTypeBase
  
  @js.native
  trait INoGeneralization extends IGeneralizationBase {
    val persistable: scala.Boolean = js.native
  }
  
  @js.native
  trait INumericAttributeTypeBase extends IAttributeType
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  trait IStoredValue extends IValueType
  
  @js.native
  trait IStringAttributeType extends IAttributeType
  
  /**
    * In version 6.6.0: added public
    */
  @js.native
  trait IValueType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsAttribute: IAttribute = js.native
    @JSName("model")
    val model_IValueType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/indexes relevant section in reference guide}
    */
  @js.native
  class Index protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val attributes: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IndexedAttribute] = js.native
    val containerAsEntity: Entity = js.native
    var dataStorageGuid: java.lang.String = js.native
    @JSName("model")
    var model_Index: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class IndexedAttribute protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.14.0: introduced
      */
    var ascending: scala.Boolean = js.native
    var attribute: Attribute | scala.Null = js.native
    val containerAsIndex: Index = js.native
    @JSName("model")
    var model_IndexedAttribute: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var `type`: IndexedAttributeType = js.native
  }
  
  @js.native
  class IndexedAttributeType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  class IndirectEntityRef protected () extends EntityRef {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val steps: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[EntityRefStep] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IIntegerAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class IntegerAttributeType protected () extends IntegerAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IIntegerAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  abstract class IntegerAttributeTypeBase protected () extends NumericAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ILongAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class LongAttributeType protected () extends IntegerAttributeTypeBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class MaxLengthRuleInfo protected () extends RuleInfo {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var maxLength: scala.Double = js.native
  }
  
  @js.native
  class MemberAccess protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var accessRights: MemberAccessRights = js.native
    var association: IAssociationBase | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
    var attribute: IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    val containerAsAccessRule: AccessRule = js.native
    @JSName("model")
    var model_MemberAccess: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class MemberAccessRights ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 7.11.0: introduced
    */
  @js.native
  abstract class MemberRef protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsAttributeValue: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.AttributeValue = js.native
    val containerAsAttributeWidget: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.AttributeWidget = js.native
    val containerAsClientTemplateParameter: mendixmodelsdkLib.distGenPagesMod.pagesNs.ClientTemplateParameter = js.native
    val containerAsDataGridColumn: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn = js.native
    val containerAsDocumentTemplatesGridSortItem: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem = js.native
    val containerAsGridColumn: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridColumn = js.native
    val containerAsListViewSearch: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewSearch = js.native
    val containerAsMemberWidget: mendixmodelsdkLib.distGenPagesMod.pagesNs.MemberWidget = js.native
    val containerAsObjectListSortItem: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ObjectListSortItem = js.native
    val containerAsPagesGridSortItem: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridSortItem = js.native
    val containerAsRangeSearchField: mendixmodelsdkLib.distGenPagesMod.pagesNs.RangeSearchField = js.native
    val containerAsSingleSearchField: mendixmodelsdkLib.distGenPagesMod.pagesNs.SingleSearchField = js.native
    val containerAsSortItem: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItem = js.native
    val containerAsStaticOrDynamicString: mendixmodelsdkLib.distGenPagesMod.pagesNs.StaticOrDynamicString = js.native
    val containerAsVariableRefExpression: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    val containerAsWebDynamicImageValue: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.WebDynamicImageValue = js.native
    val containerAsWidgetValue: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue = js.native
    var entityRef: IndirectEntityRef | scala.Null = js.native
    @JSName("model")
    var model_MemberRef: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.INoGeneralization because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined persistable, asLoaded, load, load, load, load */ @js.native
  class NoGeneralization protected () extends GeneralizationBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsEntity")
    val containerAsEntity_NoGeneralization: Entity = js.native
    var hasChangedBy: scala.Boolean = js.native
    var hasChangedDate: scala.Boolean = js.native
    var hasCreatedDate: scala.Boolean = js.native
    var hasOwner: scala.Boolean = js.native
    var persistable: scala.Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.INumericAttributeTypeBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  abstract class NumericAttributeTypeBase protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_NumericAttributeTypeBase: Attribute = js.native
  }
  
  @js.native
  class RangeRuleInfo protected () extends RuleInfo {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var maxAttribute: IAttribute | scala.Null = js.native
    val maxAttributeQualifiedName: java.lang.String | scala.Null = js.native
    var maxValue: java.lang.String = js.native
    var minAttribute: IAttribute | scala.Null = js.native
    val minAttributeQualifiedName: java.lang.String | scala.Null = js.native
    var minValue: java.lang.String = js.native
    var typeOfRange: RangeType = js.native
    var useMaxValue: scala.Boolean = js.native
    var useMinValue: scala.Boolean = js.native
  }
  
  @js.native
  class RangeType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class RegExRuleInfo protected () extends RuleInfo {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var regularExpression: mendixmodelsdkLib.distGenRegularexpressionsMod.regularexpressionsNs.IRegularExpression | scala.Null = js.native
    val regularExpressionQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class RequiredRuleInfo protected () extends RuleInfo {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class RuleInfo protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsValidationRule: ValidationRule = js.native
    @JSName("model")
    var model_RuleInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 6.6.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IStoredValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class StoredValue protected () extends ValueType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_StoredValue: Attribute = js.native
    var defaultValue: java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IStringAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class StringAttributeType protected () extends AttributeType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAttribute")
    val containerAsAttribute_StringAttributeType: Attribute = js.native
    var length: scala.Double = js.native
  }
  
  @js.native
  class UniqueRuleInfo protected () extends RuleInfo {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-rules relevant section in reference guide}
    */
  @js.native
  class ValidationRule protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: IAttribute = js.native
    val attributeQualifiedName: java.lang.String = js.native
    val containerAsEntity: Entity = js.native
    var errorMessage: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    @JSName("model")
    var model_ValidationRule: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var ruleInfo: RuleInfo = js.native
  }
  
  /**
    * In version 6.6.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IValueType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute, asLoaded, load, load, load, load */ @js.native
  abstract class ValueType protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsAttribute: Attribute | IAttribute = js.native
    @JSName("model")
    var model_ValueType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* static members */
  @js.native
  object AccessRule extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AccessRule = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * The new AccessRule will be automatically stored in the 'accessRules' property
      * of the parent security.AccessRuleContainerBase element passed as argument.
      */
    def createInAccessRuleContainerBaseUnderAccessRules(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.AccessRuleContainerBase): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AccessRule = js.native
    /**
      * Creates and returns a new AccessRule instance in the SDK and on the server.
      * The new AccessRule will be automatically stored in the 'accessRules' property
      * of the parent Entity element passed as argument.
      */
    def createInEntityUnderAccessRules(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AccessRule = js.native
  }
  
  /* static members */
  @js.native
  object ActionMoment extends js.Object {
    var After: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ActionMoment = js.native
    var Before: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ActionMoment = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Annotation = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * The new Annotation will be automatically stored in the 'annotations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DomainModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Annotation = js.native
  }
  
  /* static members */
  @js.native
  object Association extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Association instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Association = js.native
    /**
      * Creates and returns a new Association instance in the SDK and on the server.
      * The new Association will be automatically stored in the 'associations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DomainModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Association = js.native
  }
  
  /* static members */
  @js.native
  object AssociationBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AssociationDeleteBehavior extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior = js.native
    /**
      * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
      * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
      * of the parent AssociationBase element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationBase): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior = js.native
  }
  
  /* static members */
  @js.native
  object AssociationOwner extends js.Object {
    var Both: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationOwner = js.native
    var Default: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationOwner = js.native
  }
  
  /* static members */
  @js.native
  object AssociationRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationRef = js.native
  }
  
  /* static members */
  @js.native
  object AssociationType extends js.Object {
    var Reference: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationType = js.native
    var ReferenceSet: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationType = js.native
  }
  
  /* static members */
  @js.native
  object Attribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Attribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute = js.native
    /**
      * Creates and returns a new Attribute instance in the SDK and on the server.
      * The new Attribute will be automatically stored in the 'attributes' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute = js.native
  }
  
  /* static members */
  @js.native
  object AttributeRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'value' property
      * of the parent pluginwidgets.AttributeValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.18.0
      */
    def createInAttributeValueUnderValue(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.AttributeValue): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInAttributeWidgetUnderAttributeRef(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.AttributeWidget): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.ClientTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInClientTemplateParameterUnderAttributeRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ClientTemplateParameter): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInDataGridColumnUnderAttributeRef(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent documenttemplates.GridSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.GridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInGridColumnUnderAttributeRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridColumn): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'searchRefs' property
      * of the parent pages.ListViewSearch element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInListViewSearchUnderSearchRefs(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewSearch): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.MemberWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInMemberWidgetUnderAttributeRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MemberWidget): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pluginwidgets.ObjectListSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInObjectListSortItemUnderAttributeRef(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ObjectListSortItem): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.GridSortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInPagesGridSortItemUnderAttributeRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridSortItem): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
      * of the parent pages.RangeSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInRangeSearchFieldUnderLowerBoundRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.RangeSearchField): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
      * of the parent pages.RangeSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInRangeSearchFieldUnderUpperBoundRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.RangeSearchField): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.SingleSearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSingleSearchFieldUnderAttributeRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SingleSearchField): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent microflows.SortItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSortItemUnderAttributeRef(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItem): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent pages.StaticOrDynamicString element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInStaticOrDynamicStringUnderAttributeRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.StaticOrDynamicString): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'member' property
      * of the parent expressions.VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInVariableRefExpressionUnderMember(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'value' property
      * of the parent pluginwidgets.WebDynamicImageValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInWebDynamicImageValueUnderValue(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.WebDynamicImageValue): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    /**
      * Creates and returns a new AttributeRef instance in the SDK and on the server.
      * The new AttributeRef will be automatically stored in the 'attributeRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderAttributeRef(container: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
  }
  
  /* static members */
  @js.native
  object AttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AutoNumberAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AutoNumberAttributeType = js.native
    /**
      * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
      * The new AutoNumberAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AutoNumberAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object BinaryAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.BinaryAttributeType = js.native
    /**
      * Creates and returns a new BinaryAttributeType instance in the SDK and on the server.
      * The new BinaryAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.BinaryAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object BooleanAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.BooleanAttributeType = js.native
    /**
      * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
      * The new BooleanAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.BooleanAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object CalculatedValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CalculatedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.CalculatedValue = js.native
    /**
      * Creates and returns a new CalculatedValue instance in the SDK and on the server.
      * The new CalculatedValue will be automatically stored in the 'value' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.CalculatedValue = js.native
  }
  
  /* static members */
  @js.native
  object CrossAssociation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CrossAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.CrossAssociation = js.native
    /**
      * Creates and returns a new CrossAssociation instance in the SDK and on the server.
      * The new CrossAssociation will be automatically stored in the 'crossAssociations' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DomainModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.CrossAssociation = js.native
  }
  
  /* static members */
  @js.native
  object CurrencyAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.CurrencyAttributeType = js.native
    /**
      * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
      * The new CurrencyAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.CurrencyAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DateTimeAttributeType = js.native
    /**
      * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
      * The new DateTimeAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DateTimeAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DecimalAttributeType = js.native
    /**
      * Creates and returns a new DecimalAttributeType instance in the SDK and on the server.
      * The new DecimalAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DecimalAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalAttributeTypeBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DeletingBehavior extends js.Object {
    var DeleteMeAndReferences: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior = js.native
    var DeleteMeButKeepReferences: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior = js.native
    var DeleteMeIfNoReferences: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DeletingBehavior = js.native
  }
  
  /* static members */
  @js.native
  object DirectEntityRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.CreateObjectClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInCreateObjectClientActionUnderEntityRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.CreateObjectClientAction): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.EntityPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityPathSourceUnderEntityRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.EntityPathSource): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent documenttemplates.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityWidgetUnderEntityRef(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.EntityWidget): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.NewButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.16.0
      */
    def createInNewButtonUnderEntityRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NewButton): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInReferenceSetSelectorUnderConstrainedByRefs(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ReferenceSetSelector): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.SelectorXPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSelectorXPathSourceUnderConstrainedByRefs(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SelectorXPathSource): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
    /**
      * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
      * The new DirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderEntityRef(container: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DirectEntityRef = js.native
  }
  
  /* static members */
  @js.native
  object DomainModel extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates a new DomainModel unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DomainModel = js.native
  }
  
  /* static members */
  @js.native
  object Entity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Entity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity = js.native
    /**
      * Creates and returns a new Entity instance in the SDK and on the server.
      * The new Entity will be automatically stored in the 'entities' property
      * of the parent DomainModel element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.DomainModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity = js.native
  }
  
  /* static members */
  @js.native
  object EntityRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object EntityRefStep extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityRefStep instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EntityRefStep = js.native
    /**
      * Creates and returns a new EntityRefStep instance in the SDK and on the server.
      * The new EntityRefStep will be automatically stored in the 'steps' property
      * of the parent IndirectEntityRef element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EntityRefStep = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EnumerationAttributeType = js.native
    /**
      * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
      * The new EnumerationAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EnumerationAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object EqualsToRuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EqualsToRuleInfo = js.native
    /**
      * Creates and returns a new EqualsToRuleInfo instance in the SDK and on the server.
      * The new EqualsToRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EqualsToRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object EventHandler extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EventHandler instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EventHandler = js.native
    /**
      * Creates and returns a new EventHandler instance in the SDK and on the server.
      * The new EventHandler will be automatically stored in the 'eventHandlers' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EventHandler = js.native
  }
  
  /* static members */
  @js.native
  object EventType extends js.Object {
    var Commit: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
    var Create: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
    var Delete: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
    var RollBack: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EventType = js.native
  }
  
  /* static members */
  @js.native
  object FloatAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.FloatAttributeType = js.native
    /**
      * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
      * The new FloatAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.FloatAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object FloatAttributeTypeBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Generalization extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Generalization instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Generalization = js.native
    /**
      * Creates and returns a new Generalization instance in the SDK and on the server.
      * The new Generalization will be automatically stored in the 'generalization' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Generalization = js.native
  }
  
  /* static members */
  @js.native
  object GeneralizationBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HashedStringAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.HashedStringAttributeType = js.native
    /**
      * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
      * The new HashedStringAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.HashedStringAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object Index extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Index instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Index = js.native
    /**
      * Creates and returns a new Index instance in the SDK and on the server.
      * The new Index will be automatically stored in the 'indexes' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Index = js.native
  }
  
  /* static members */
  @js.native
  object IndexedAttribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndexedAttribute = js.native
    /**
      * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
      * The new IndexedAttribute will be automatically stored in the 'attributes' property
      * of the parent Index element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Index): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndexedAttribute = js.native
  }
  
  /* static members */
  @js.native
  object IndexedAttributeType extends js.Object {
    var ChangedDate: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType = js.native
    var CreatedDate: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType = js.native
    var Normal: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndexedAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object IndirectEntityRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.CreateObjectClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInCreateObjectClientActionUnderEntityRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.CreateObjectClientAction): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.EntityPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityPathSourceUnderEntityRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.EntityPathSource): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent documenttemplates.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInEntityWidgetUnderEntityRef(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.EntityWidget): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent MemberRef element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInMemberRefUnderEntityRef(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberRef): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent pages.NewButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.16.0
      */
    def createInNewButtonUnderEntityRef(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NewButton): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInReferenceSetSelectorUnderConstrainedByRefs(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ReferenceSetSelector): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
      * of the parent pages.SelectorXPathSource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInSelectorXPathSourceUnderConstrainedByRefs(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SelectorXPathSource): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
    /**
      * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
      * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 and higher
      */
    def createInWidgetValueUnderEntityRef(container: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IndirectEntityRef = js.native
  }
  
  /* static members */
  @js.native
  object IntegerAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IntegerAttributeType = js.native
    /**
      * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
      * The new IntegerAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IntegerAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object IntegerAttributeTypeBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object LongAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new LongAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.LongAttributeType = js.native
    /**
      * Creates and returns a new LongAttributeType instance in the SDK and on the server.
      * The new LongAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.LongAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object MaxLengthRuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MaxLengthRuleInfo = js.native
    /**
      * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
      * The new MaxLengthRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MaxLengthRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object MemberAccess extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MemberAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberAccess = js.native
    /**
      * Creates and returns a new MemberAccess instance in the SDK and on the server.
      * The new MemberAccess will be automatically stored in the 'memberAccesses' property
      * of the parent AccessRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AccessRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberAccess = js.native
  }
  
  /* static members */
  @js.native
  object MemberAccessRights extends js.Object {
    var None: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights = js.native
    var ReadOnly: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights = js.native
    var ReadWrite: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberAccessRights = js.native
  }
  
  /* static members */
  @js.native
  object MemberRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NoGeneralization extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoGeneralization instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.NoGeneralization = js.native
    /**
      * Creates and returns a new NoGeneralization instance in the SDK and on the server.
      * The new NoGeneralization will be automatically stored in the 'generalization' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.NoGeneralization = js.native
  }
  
  /* static members */
  @js.native
  object NumericAttributeTypeBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RangeRuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RangeRuleInfo = js.native
    /**
      * Creates and returns a new RangeRuleInfo instance in the SDK and on the server.
      * The new RangeRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RangeRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RangeType extends js.Object {
    var Between: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RangeType = js.native
    var GreaterThanOrEqualTo: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RangeType = js.native
    var SmallerThanOrEqualTo: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RangeType = js.native
  }
  
  /* static members */
  @js.native
  object RegExRuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RegExRuleInfo = js.native
    /**
      * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
      * The new RegExRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RegExRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequiredRuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RequiredRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RequiredRuleInfo = js.native
    /**
      * Creates and returns a new RequiredRuleInfo instance in the SDK and on the server.
      * The new RequiredRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.RequiredRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object RuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StoredValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StoredValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.StoredValue = js.native
    /**
      * Creates and returns a new StoredValue instance in the SDK and on the server.
      * The new StoredValue will be automatically stored in the 'value' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.StoredValue = js.native
  }
  
  /* static members */
  @js.native
  object StringAttributeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringAttributeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.StringAttributeType = js.native
    /**
      * Creates and returns a new StringAttributeType instance in the SDK and on the server.
      * The new StringAttributeType will be automatically stored in the 'type' property
      * of the parent Attribute element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Attribute): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.StringAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object UniqueRuleInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.UniqueRuleInfo = js.native
    /**
      * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
      * The new UniqueRuleInfo will be automatically stored in the 'ruleInfo' property
      * of the parent ValidationRule element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.UniqueRuleInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValidationRule extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ValidationRule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule = js.native
    /**
      * Creates and returns a new ValidationRule instance in the SDK and on the server.
      * The new ValidationRule will be automatically stored in the 'validationRules' property
      * of the parent Entity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.Entity): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule = js.native
  }
  
  /* static members */
  @js.native
  object ValueType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDomainmodelsMod.StructureVersionInfo = js.native
  }
  
}

