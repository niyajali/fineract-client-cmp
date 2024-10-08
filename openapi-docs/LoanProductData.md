
# LoanProductData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountMovesOutOfNPAOnlyOnArrearsCompletion** | **kotlin.Boolean** |  |  [optional] |
| **accountingMappingOptions** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;GLAccountData&gt;&gt;** |  |  [optional] |
| **accountingMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **accountingRule** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **accountingRuleOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **advancedPaymentAllocationFutureInstallmentAllocationRules** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **advancedPaymentAllocationTransactionTypes** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **advancedPaymentAllocationTypes** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **allowApprovedDisbursedAmountsOverApplied** | **kotlin.Boolean** |  |  [optional] |
| **allowAttributeOverrides** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional] |
| **allowPartialPeriodInterestCalculation** | **kotlin.Boolean** |  |  [optional] |
| **allowVariableInstallments** | **kotlin.Boolean** |  |  [optional] |
| **amortizationType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **amortizationTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **annualInterestRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **canDefineInstallmentAmount** | **kotlin.Boolean** |  |  [optional] |
| **canUseForTopup** | **kotlin.Boolean** |  |  [optional] |
| **chargeOptions** | [**kotlin.collections.List&lt;ChargeData&gt;**](ChargeData.md) |  |  [optional] |
| **charges** | [**kotlin.collections.List&lt;ChargeData&gt;**](ChargeData.md) |  |  [optional] |
| **closeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **compoundingToBePostedAsTransaction** | **kotlin.Boolean** |  |  [optional] |
| **currency** | [**CurrencyData**](CurrencyData.md) |  |  [optional] |
| **currencyOptions** | [**kotlin.collections.List&lt;CurrencyData&gt;**](CurrencyData.md) |  |  [optional] |
| **daysInMonthType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **daysInMonthTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **daysInYearType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **daysInYearTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **defaultDifferentialLendingRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **delinquencyBucket** | [**DelinquencyBucketData**](DelinquencyBucketData.md) |  |  [optional] |
| **delinquencyBucketOptions** | [**kotlin.collections.List&lt;DelinquencyBucketData&gt;**](DelinquencyBucketData.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **disableScheduleExtensionForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **disallowExpectedDisbursements** | **kotlin.Boolean** |  |  [optional] |
| **disbursedAmountPercentageForDownPayment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **dueDaysForRepaymentEvent** | **kotlin.Int** |  |  [optional] |
| **enableAutoRepaymentForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableInstallmentLevelDelinquency** | **kotlin.Boolean** |  |  [optional] |
| **equalAmortization** | **kotlin.Boolean** |  |  [optional] |
| **externalId** | **kotlin.String** |  |  [optional] |
| **feeToIncomeAccountMappings** | [**kotlin.collections.List&lt;ChargeToGLAccountMapper&gt;**](ChargeToGLAccountMapper.md) |  |  [optional] |
| **fixedPrincipalPercentagePerInstallment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **floatingInterestRateCalculationAllowed** | **kotlin.Boolean** |  |  [optional] |
| **floatingRateId** | **kotlin.Int** |  |  [optional] |
| **floatingRateName** | **kotlin.String** |  |  [optional] |
| **floatingRateOptions** | [**kotlin.collections.List&lt;FloatingRateData&gt;**](FloatingRateData.md) |  |  [optional] |
| **fundId** | **kotlin.Long** |  |  [optional] |
| **fundName** | **kotlin.String** |  |  [optional] |
| **fundOptions** | [**kotlin.collections.List&lt;FundData&gt;**](FundData.md) |  |  [optional] |
| **graceOnArrearsAgeing** | **kotlin.Int** |  |  [optional] |
| **graceOnInterestCharged** | **kotlin.Int** |  |  [optional] |
| **graceOnInterestPayment** | **kotlin.Int** |  |  [optional] |
| **graceOnPrincipalPayment** | **kotlin.Int** |  |  [optional] |
| **holdGuaranteeFunds** | **kotlin.Boolean** |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **inArrearsTolerance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **includeInBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |
| **installmentAmountInMultiplesOf** | **kotlin.Int** |  |  [optional] |
| **interestCalculationPeriodType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **interestCalculationPeriodTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **interestRateDifferential** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **interestRateFrequencyType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **interestRateFrequencyTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **interestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **interestRateVariationsForBorrowerCycle** | [**kotlin.collections.List&lt;LoanProductBorrowerCycleVariationData&gt;**](LoanProductBorrowerCycleVariationData.md) |  |  [optional] |
| **interestRecalculationCompoundingTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **interestRecalculationData** | [**LoanProductInterestRecalculationData**](LoanProductInterestRecalculationData.md) |  |  [optional] |
| **interestRecalculationDayOfWeekTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **interestRecalculationEnabled** | **kotlin.Boolean** |  |  [optional] |
| **interestRecalculationFrequencyTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **interestRecalculationNthDayTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **interestType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **interestTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **isAllowPartialPeriodInterestCalculation** | **kotlin.Boolean** |  |  [optional] |
| **isEqualAmortization** | **kotlin.Boolean** |  |  [optional] |
| **isFloatingInterestRateCalculationAllowed** | **kotlin.Boolean** |  |  [optional] |
| **isInterestRecalculationEnabled** | **kotlin.Boolean** |  |  [optional] |
| **isLinkedToFloatingInterestRates** | **kotlin.Boolean** |  |  [optional] |
| **isRatesEnabled** | **kotlin.Boolean** |  |  [optional] |
| **linkedToFloatingInterestRates** | **kotlin.Boolean** |  |  [optional] |
| **loanProductConfigurableAttributes** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional] |
| **loanScheduleProcessingType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **loanScheduleProcessingTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **loanScheduleType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **loanScheduleTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **maxDifferentialLendingRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **maxInterestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **maxNumberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **maxPrincipal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **maxTrancheCount** | **kotlin.Int** |  |  [optional] |
| **maximumGap** | **kotlin.Int** |  |  [optional] |
| **minDifferentialLendingRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **minInterestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **minNumberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **minPrincipal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **minimumDaysBetweenDisbursalAndFirstRepayment** | **kotlin.Int** |  |  [optional] |
| **minimumGap** | **kotlin.Int** |  |  [optional] |
| **multiDisburseLoan** | **kotlin.Boolean** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **numberOfRepaymentVariationsForBorrowerCycle** | [**kotlin.collections.List&lt;LoanProductBorrowerCycleVariationData&gt;**](LoanProductBorrowerCycleVariationData.md) |  |  [optional] |
| **numberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **outstandingLoanBalance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **overAppliedCalculationType** | **kotlin.String** |  |  [optional] |
| **overAppliedNumber** | **kotlin.Int** |  |  [optional] |
| **overDueDaysForRepaymentEvent** | **kotlin.Int** |  |  [optional] |
| **overdueDaysForNPA** | **kotlin.Int** |  |  [optional] |
| **paymentAllocation** | [**kotlin.collections.List&lt;AdvancedPaymentData&gt;**](AdvancedPaymentData.md) |  |  [optional] |
| **paymentChannelToFundSourceMappings** | [**kotlin.collections.List&lt;PaymentTypeToGLAccountMapper&gt;**](PaymentTypeToGLAccountMapper.md) |  |  [optional] |
| **paymentTypeOptions** | [**kotlin.collections.List&lt;PaymentTypeData&gt;**](PaymentTypeData.md) |  |  [optional] |
| **penaltyOptions** | [**kotlin.collections.List&lt;ChargeData&gt;**](ChargeData.md) |  |  [optional] |
| **penaltyToIncomeAccountMappings** | [**kotlin.collections.List&lt;ChargeToGLAccountMapper&gt;**](ChargeToGLAccountMapper.md) |  |  [optional] |
| **preClosureInterestCalculationStrategyOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **principal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **principalThresholdForLastInstallment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **principalVariationsForBorrowerCycle** | [**kotlin.collections.List&lt;LoanProductBorrowerCycleVariationData&gt;**](LoanProductBorrowerCycleVariationData.md) |  |  [optional] |
| **productGuaranteeData** | [**LoanProductGuaranteeData**](LoanProductGuaranteeData.md) |  |  [optional] |
| **rateOptions** | [**kotlin.collections.List&lt;RateData&gt;**](RateData.md) |  |  [optional] |
| **rates** | [**kotlin.collections.List&lt;RateData&gt;**](RateData.md) |  |  [optional] |
| **ratesEnabled** | **kotlin.Boolean** |  |  [optional] |
| **recurringMoratoriumOnPrincipalPeriods** | **kotlin.Int** |  |  [optional] |
| **repaymentEvery** | **kotlin.Int** |  |  [optional] |
| **repaymentFrequencyType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **repaymentFrequencyTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **repaymentStartDateType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **repaymentStartDateTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **rescheduleStrategyTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **shortName** | **kotlin.String** |  |  [optional] |
| **startDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **syncExpectedWithDisbursementDate** | **kotlin.Boolean** |  |  [optional] |
| **transactionProcessingStrategyCode** | **kotlin.String** |  |  [optional] |
| **transactionProcessingStrategyName** | **kotlin.String** |  |  [optional] |
| **transactionProcessingStrategyOptions** | [**kotlin.collections.List&lt;TransactionProcessingStrategyData&gt;**](TransactionProcessingStrategyData.md) |  |  [optional] |
| **useBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |
| **valueConditionTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |



