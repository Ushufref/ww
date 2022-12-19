require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        q!: [* *ривет* */* *дравствуй* */* *обр* * (~день/~вечер/~утро) *]
        a: sap
        
    state: /weather
        q!: * *о* *
        a: nice
    
    state: /currency
        q!: [* *урс * валют* */* *алюты */ * *убл* *]
        a: 1 EUR = 73.28 RUB


    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

