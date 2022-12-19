require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

  
        
    state: /weather
        q!: [* *огод* */*рогноз* * погоды/* *рогноз* */ * *градус* *]
        a: nice
    
    state: /currency
        q!: [* *урс * валют */* *алюты *]
        a: 1 EUR = 73.28 RUB


    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

