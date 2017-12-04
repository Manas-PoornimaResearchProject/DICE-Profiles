/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Spark.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparkFactoryImpl extends EFactoryImpl implements SparkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SparkFactory init() {
		try {
			SparkFactory theSparkFactory = (SparkFactory)EPackage.Registry.INSTANCE.getEFactory(SparkPackage.eNS_URI);
			if (theSparkFactory != null) {
				return theSparkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SparkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SparkPackage.SPARK_SCENARIO: return createSparkScenario();
			case SparkPackage.SPARK_OPERATION: return createSparkOperation();
			case SparkPackage.SPARK_ACTION: return createSparkAction();
			case SparkPackage.SPARK_TRANSFORMATION: return createSparkTransformation();
			case SparkPackage.SPARK_NODE: return createSparkNode();
			case SparkPackage.SPARK_WORKLOAD_EVENT: return createSparkWorkloadEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkScenario createSparkScenario() {
		SparkScenarioImpl sparkScenario = new SparkScenarioImpl();
		return sparkScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkOperation createSparkOperation() {
		SparkOperationImpl sparkOperation = new SparkOperationImpl();
		return sparkOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkAction createSparkAction() {
		SparkActionImpl sparkAction = new SparkActionImpl();
		return sparkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkTransformation createSparkTransformation() {
		SparkTransformationImpl sparkTransformation = new SparkTransformationImpl();
		return sparkTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkNode createSparkNode() {
		SparkNodeImpl sparkNode = new SparkNodeImpl();
		return sparkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkWorkloadEvent createSparkWorkloadEvent() {
		SparkWorkloadEventImpl sparkWorkloadEvent = new SparkWorkloadEventImpl();
		return sparkWorkloadEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkPackage getSparkPackage() {
		return (SparkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SparkPackage getPackage() {
		return SparkPackage.eINSTANCE;
	}

} //SparkFactoryImpl
