/**
 */
package es.unizar.disco.dice.Basic_Data_Types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data_Types'"
 * @generated
 */
public interface Basic_Data_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Basic_Data_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/libraries/Basic_Data_Types/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Basic_Data_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Basic_Data_TypesPackage eINSTANCE = es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl <em>NFP Privacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getNFP_Privacy()
	 * @generated
	 */
	int NFP_PRIVACY = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRIVACY__EXPR = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRIVACY__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>NFP Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRIVACY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl <em>Script Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Script Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__SCRIPT_ID = 0;

	/**
	 * The feature id for the '<em><b>Script Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__SCRIPT_URI = 1;

	/**
	 * The feature id for the '<em><b>Script Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__SCRIPT_KIND = 2;

	/**
	 * The number of structural features of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.FirewallRuleImpl
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getFirewallRule()
	 * @generated
	 */
	int FIREWALL_RULE = 2;

	/**
	 * The feature id for the '<em><b>Allowed Ip Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__ALLOWED_IP_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__PORT = 1;

	/**
	 * The number of structural features of the '<em>Firewall Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy <em>NFP Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Privacy</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy
	 * @generated
	 */
	EClass getNFP_Privacy();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getExpr()
	 * @see #getNFP_Privacy()
	 * @generated
	 */
	EAttribute getNFP_Privacy_Expr();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getSource()
	 * @see #getNFP_Privacy()
	 * @generated
	 */
	EAttribute getNFP_Privacy_Source();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.ScriptType
	 * @generated
	 */
	EClass getScriptType();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptId <em>Script Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Id</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptId()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_ScriptId();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptUri <em>Script Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Uri</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptUri()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_ScriptUri();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptKind <em>Script Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Kind</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptKind()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_ScriptKind();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule <em>Firewall Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall Rule</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.FirewallRule
	 * @generated
	 */
	EClass getFirewallRule();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getAllowedIpPrefix <em>Allowed Ip Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Ip Prefix</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getAllowedIpPrefix()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_AllowedIpPrefix();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getPort()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Basic_Data_TypesFactory getBasic_Data_TypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl <em>NFP Privacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getNFP_Privacy()
		 * @generated
		 */
		EClass NFP_PRIVACY = eINSTANCE.getNFP_Privacy();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_PRIVACY__EXPR = eINSTANCE.getNFP_Privacy_Expr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_PRIVACY__SOURCE = eINSTANCE.getNFP_Privacy_Source();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl <em>Script Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.ScriptTypeImpl
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getScriptType()
		 * @generated
		 */
		EClass SCRIPT_TYPE = eINSTANCE.getScriptType();

		/**
		 * The meta object literal for the '<em><b>Script Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__SCRIPT_ID = eINSTANCE.getScriptType_ScriptId();

		/**
		 * The meta object literal for the '<em><b>Script Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__SCRIPT_URI = eINSTANCE.getScriptType_ScriptUri();

		/**
		 * The meta object literal for the '<em><b>Script Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__SCRIPT_KIND = eINSTANCE.getScriptType_ScriptKind();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.FirewallRuleImpl
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getFirewallRule()
		 * @generated
		 */
		EClass FIREWALL_RULE = eINSTANCE.getFirewallRule();

		/**
		 * The meta object literal for the '<em><b>Allowed Ip Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__ALLOWED_IP_PREFIX = eINSTANCE.getFirewallRule_AllowedIpPrefix();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__PORT = eINSTANCE.getFirewallRule_Port();

	}

} //Basic_Data_TypesPackage
