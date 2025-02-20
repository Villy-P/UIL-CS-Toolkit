<script lang="ts">
	import type { Question } from "../types/question";
	import Markdown from "./Markdown.svelte";

    let { question, index }: {
        question: Question;
        index: number;
    } = $props();
</script>

<h1>Question #{index + 1}</h1>
<Markdown content={question.question}/>
<div class="flex flex-col gap-1">
    {#each question.answers as answer}
        <button class="bg-[#151515] p-2 rounded-md w-96 cursor-pointer hover:bg-[#1f1f1f] my-0.5">
            <Markdown content={answer}/>
        </button>
    {/each}
</div>
<hr class="my-4"/>